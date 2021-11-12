package Interview.limiter;

import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucket {
    /**
     * 唯一标识
     */
    private String key;
    /**
     * 桶的大小
     */
    private Integer limit;

    /**
     * 桶当前的token
     */
    private volatile AtomicInteger tokens;

    /**
     * 加token
     */
    public void addToken() {
        if (tokens == null) {
            tokens = new AtomicInteger(0);
        }
        tokens.incrementAndGet();
    }

    /**
     * 减token
     */
    public void delToken() {
        tokens.decrementAndGet();
    }

    public synchronized boolean getToken() {
        if (tokens == null) {
            tokens = new AtomicInteger(0);
        }
        if (tokens.intValue() > 0) {
            return tokens.decrementAndGet() > 0;
        }
        return false;
    }

}
