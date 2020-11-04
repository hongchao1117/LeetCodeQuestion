package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        getResHelper(strs,res,0,new ArrayList<>());
        return res;
    }

    private void getResHelper(String[] strs, List<List<String>> res, int index, ArrayList<String> tempList) {
        if (index == strs.length) return;
        Queue<Character> queue = new PriorityQueue<>();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {

            }
        }
    }
}
