package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) return res;
        methodHelper(res, "", 0, 0, n);
        return res;
    }

    private void methodHelper(List<String> res, String s, int count1, int count2, int n) {
        if (count1 > n || count2 > n) return;
        if (count1 == n && count2 == n) {
            res.add(s);
        }
        if (count1 >= count2) {
            methodHelper(res, s + "(", count1 + 1, count2, n);
            methodHelper(res, s + ")", count1, count2 + 1, n);
        }

    }

}
