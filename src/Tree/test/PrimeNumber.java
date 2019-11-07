package Tree.test;

/**
 * 素数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        final int TotalNum = 50;//素数总个数
        final int LineNum = 10;//每行素数个数

        int count =0;
        int num = 2;//从2开始检测

        while (count<TotalNum){
            boolean flag = true;
            for (int i = 2; i <= num/2 ; i++) {
                if (num%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                if (count%LineNum==0){
                    System.out.println(num);//输出并换行
                }
                else
                    System.out.print(num+" ");
            }
            num++;
        }

    }
}
