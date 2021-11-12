package Test;

import Interview.TokenLimiter;

import java.util.concurrent.TimeUnit;

public class test02 {
    public static void main(String[] args) {
        TokenLimiter tokenLimiter = new TokenLimiter(1000, TimeUnit.SECONDS, 1000);
        System.out.println(tokenLimiter.tryAcquire());
    }
}
