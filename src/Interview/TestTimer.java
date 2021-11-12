package Interview;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务调度器
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer t1 = new Timer();
        MyTask myTask = new MyTask();
//        t1.schedule(myTask, 3000);
        t1.schedule(myTask, 1000, 10 * 1000);
    }

    private static class MyTask extends TimerTask {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("任务：" + i);
            }
        }
    }
}
