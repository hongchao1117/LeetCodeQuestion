package Interview;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TokenLimiter {
    private final ArrayBlockingQueue<String> blockingQueue;
    private final int limit;
    private final TimeUnit timeUnit;
    private final int period;

    public TokenLimiter(int limit, TimeUnit timeUnit, int period) {
        blockingQueue = new ArrayBlockingQueue<>(limit);
        this.limit = limit;
        this.timeUnit = timeUnit;
        this.period = period;
        init();
        start();
    }

    private void start() {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(this::addToken, 10, period, timeUnit);
    }

    private void addToken() {
        blockingQueue.offer("1");
    }

    private void init() {
        for (int i = 0; i < limit; i++) {
            blockingQueue.add("1");
        }
    }

    public boolean tryAcquire() {
        return blockingQueue.poll() != null;
    }

    public static void main(String[] args) throws InterruptedException {
        TokenLimiter limiter = new TokenLimiter(1000, TimeUnit.SECONDS, 1000);
        while (true) {
            new Thread(() -> {
                System.out.println(limiter.tryAcquire());
            }).start();
            Thread.sleep(1);
        }
    }

}
