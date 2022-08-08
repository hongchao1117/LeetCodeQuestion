package Test;

public class ProducerAndConsumerDemo {
    public static void main(String[] args) {

    }

    private static int count = 0;
    private static final int FUll = 100;
    private static String lock = "lock";

    class Producer implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (count == FUll) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count++;
                lock.notifyAll();
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                while (count == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count--;
                lock.notifyAll();
            }

        }
    }
}
