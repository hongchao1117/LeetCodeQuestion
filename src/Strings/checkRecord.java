package Strings;

public class checkRecord {
    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(CheckRecord("AAAA"));
    }

    private static boolean CheckRecord(String s) {
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (int i = 0,j=0,k=0; i < chars.length; i++) {
            if (chars[i]=='A'){
                k++;
                if (k>1){
                    flag = false;
                    break;
                }
                if (j>0) j=0;
            }
            else if (chars[i] == 'L'){
                j++;
                if (j==3){
                    flag = false;
                    break;
                }
            }
            else
                if (j>0)
                    j=0;
        }
       return flag;

    }
}
