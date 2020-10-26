package Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            for (int i = 0; i < totalThread; i++) {
                System.out.println("run.."+i);
                countDownLatch.countDown();
            }
        });
        countDownLatch.await();
        System.out.println("end");
        executorService.shutdown();
    }

}
