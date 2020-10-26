package dp;

/**
 * 基本思路如上，然后我们可以根据动态规划的套路：
 * 1.构造dp数组：tmp[]为n个骰子的点数概率数组，pre[]为n-1个骰子的点数概率数组，一个骰子的点数概率数组显然是6个六分之一,不需要另设数组。
 * 2.初始化dp数组：pre[]={1/6d,1/6d,1/6d,1/6d,1/6d,1/6d}
 * 3.构造状态转移方程:tmp[x+y]+=pre[x]*num[y];
 *
 */
public class TwoSum {
    public double[] twoSum(int n){
        double pre[]={1/6d,1/6d,1/6d,1/6d,1/6d,1/6d};
        for(int i=2;i<=n;i++){
            double tmp[]=new double[5*i+1];
            for(int j=0;j<pre.length;j++)
                for(int x=0;x<6;x++)
                    tmp[j+x]+=pre[j]/6;
            pre=tmp;
        }
        return pre;
    }
}
