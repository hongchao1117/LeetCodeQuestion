package Array;

import java.util.ArrayList;
import java.util.List;

public class partition {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        getRes(res, 0, new ArrayList<>(), s);
        return res;
    }

    private void getRes(List<List<String>> res, int index, List<String> list, String s) {
        if (index == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String s1 = s.substring(index, i + 1);
            if (!isPlidrame(s1)) {
                continue;
            }
            list.add(s1);
            getRes(res, i + 1, list, s);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPlidrame(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
