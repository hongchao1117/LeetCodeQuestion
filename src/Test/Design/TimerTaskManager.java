package Test.Design;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.concurrent.PriorityBlockingQueue;

//开的一个线程去轮询
public class TimerTaskManager extends Thread {

    //是否关闭
    private static boolean isOpen = true;

    //核心优先队列
    private final PriorityBlockingQueue<TimerTask> consumersByExpiration = new PriorityBlockingQueue<>(5,
            new Comparator<TimerTask>() {
                @Override
                public int compare(TimerTask o1, TimerTask o2) {
                    return (int) (o1.getExpiration() - o2.getExpiration());
                }
            }
    );

    //将Task加入队列的方法，和过期时间
    public void addTask(TimerTask timerTask) {
        consumersByExpiration.add(timerTask);
    }

    //关闭定时任务
    public void shutDown() {
        isOpen = false;
    }

    public TimerTaskManager() {
        this.start();
    }

    @Override
    public void run() {
        while (isOpen) {
            if (consumersByExpiration.size() > 0) {
                long curTime = new Date().getTime();
                //获得最早的那个到期那个任务，看时间是否到了
                if (consumersByExpiration.element().getExpiration() <= curTime) {
                    //已经过期，执行任务，去掉该任务
                    //任务逻辑~~~

                    System.out.println("执行" + consumersByExpiration.element().getTaskId() + "的当前时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(curTime)
                            + "过期的时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(consumersByExpiration.element().getExpiration()));
                    //然后去掉
                    consumersByExpiration.poll();
                }
            }

        }

    }
}