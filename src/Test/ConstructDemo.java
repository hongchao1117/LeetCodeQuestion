package Test;

public class ConstructDemo {
    int num = 0;
    private int count = 0;
    private int capacity = 5;//资源池中允许存放的资源数目

    Object object = new Object();

    //生产者
    public void product() throws InterruptedException {
        synchronized (object) {
            //判断等待时机
            if (count == capacity) {
                object.wait();
            }
            //do something
            num++;
            count++;
            System.out.println(Thread.currentThread().getName() + "--producing 数字--" + num
                    + ",资源池剩余数据个数," + count);
            //干完活进行唤醒消费
            object.notifyAll();
        }
    }

    //消费者
    public void consumer() throws InterruptedException {
        synchronized (object) {
            //判断等待时机
            if (count == 0) {
                object.wait();
            }
            //do something
            num--;
            count--;
            System.out.println(Thread.currentThread().getName() + "--consuming 数字--" + num
                    + ",资源池剩余数据个数," + count);
            object.notifyAll();
        }
    }

    //主函数
    public static void main(String[] args) {
        ConstructDemo demo = new ConstructDemo();
        new Thread(() -> {
            while (true) {
                try {
                    demo.product();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "produce").start();

        new Thread(() -> {
            while (true) {
                try {
                    demo.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "consume").start();
    }
}
