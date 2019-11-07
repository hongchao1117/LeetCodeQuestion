package GreedyAlo;

public class minDeletionSize {
    public static void main(String[] args) {
        String[] strs = new String[]{"cba", "daf", "ghi"};
        if (strs == null || strs.length == 0) {
//            return 0;
        }
        int n = strs[0].length();//每个字符串的长度
        System.out.println(n);
        int m = strs.length;//共有多少个字符串
        System.out.println(m);
        int size = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    size++;
                    break;
                }
            }
        }
//        return size;
    }
}




