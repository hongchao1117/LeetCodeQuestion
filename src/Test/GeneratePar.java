package Test;

import java.util.ArrayList;
import java.util.List;


/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]
 */

public class GeneratePar {

    public static void main(String[] args) {
        List<String> list = generatePar(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> generatePar(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        generate(res, 0, 0, n, "");
        return res;
    }

    private static void generate(List<String> res, int count1, int count2, int n, String s) {
        if (count1 > n || count2 > n) return;
        if (count1 == n && count2 == n) {
            res.add(s);
        }
        if (count1 >= count2) {
            generate(res, count1 + 1, count2, n, s + "(");
            generate(res, count1, count2 + 1, n, s + ")");
        }
    }

}
