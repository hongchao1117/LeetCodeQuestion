package Test;

public class ConstructDemo {
//    int num = 0;
//    private int count = 0;
//    private int capacity = 5;//资源池中允许存放的资源数目
//
//    Object object = new Object();
//
//    //生产者
//    public void product() throws InterruptedException {
//        synchronized (object) {
//            //判断等待时机
//            if (count == capacity) {
//                object.wait();
//            }
//            //do something
//            num++;
//            count++;
//            System.out.println(Thread.currentThread().getName() + "--producing 数字--" + num
//                    + ",资源池剩余数据个数," + count);
//            //干完活进行唤醒消费
//            object.notifyAll();
//        }
//    }
//
//    //消费者
//    public void consumer() throws InterruptedException {
//        synchronized (object) {
//            //判断等待时机
//            if (count == 0) {
//                object.wait();
//            }
//            //do something
//            num--;
//            count--;
//            System.out.println(Thread.currentThread().getName() + "--consuming 数字--" + num
//                    + ",资源池剩余数据个数," + count);
//            object.notifyAll();
//        }
//    }
//
//    //主函数
//    public static void main(String[] args) {
//        ConstructDemo demo = new ConstructDemo();
//        new Thread(() -> {
//            while (true) {
//                try {
//                    demo.product();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "produce").start();
//
//        new Thread(() -> {
//            while (true) {
//                try {
//                    demo.consumer();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }, "consume").start();
//    }

    //输入是1，中位数是1；输入2，中位数是1.5；输入3，中位数2；

//    PriorityQueue<Integer> pqMax;
//    PriorityQueue<Integer> pqMin;
//
//    public ConstructDemo() {
//        pqMax = new PriorityQueue<>((a, b) -> (a - b));
//        pqMin = new PriorityQueue<>((a, b) -> (b - a));
//    }
//
//    public void addNum(int num) {
//        if (pqMin.isEmpty() || num <= pqMin.peek()) {
//            pqMin.add(num);
//            if (pqMax.size() + 1 < pqMin.size()) {
//                pqMax.add(pqMin.poll());
//            }
//        } else {
//            pqMax.add(num);
//            if (pqMax.size() > pqMin.size()) {
//                pqMin.add(pqMax.poll());
//            }
//        }
//    }
//
//    public double findMedianNum() {
//        if (pqMin.size() > pqMax.size()) {
//            return pqMin.peek();
//        }
//        return (pqMax.peek() + pqMin.peek()) / 2.0;
//    }

    public static void main(String[] args) {

    }
}
