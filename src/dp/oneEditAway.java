package dp;

public class oneEditAway {
    public boolean oneEditAway(String first, String second) {
        int len = first.length() - second.length();
        if (Math.abs(len) > 1) {
            return false;
        }
        int count = 1;
        for (int i = 0, j = 0; i < first.length() && j < second.length(); i++, j++) {
            if (first.charAt(i) != second.charAt(j)) {
                count--;
                if (len == 1) {
                    j--;
                }else if (len == -1){
                    i--;
                }
            }
            if (count<0){
                return false;
            }
        }
        return true;
    }
}
