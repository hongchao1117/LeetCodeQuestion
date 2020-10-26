package dp;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 你可以认为每种硬币的数量是无限的。
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount+1];
        f[0] = 0;
        for (int i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i>=coins[j] && f[i - coins[j]]!=Integer.MAX_VALUE)
                f[i] = Math.min(f[i-coins[j]]+1,f[i]);
            }
        }
        return f[amount]==Integer.MAX_VALUE?-1:f[amount];
    }
}
