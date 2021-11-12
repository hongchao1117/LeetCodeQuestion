package Interview.limiter;

public class TokenProducer implements Runnable {

    protected TokenBucket tokenBucket;

    public TokenProducer(TokenBucket tokenBucket) {
        this.tokenBucket = tokenBucket;
    }

    @Override
    public void run() {
        tokenBucket.addToken();
    }
}
