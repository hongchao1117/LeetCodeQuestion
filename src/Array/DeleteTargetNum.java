package Array;

import java.util.ArrayList;
import java.util.List;

public class DeleteTargetNum {

    public List<Integer> deleteTarget(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != target) {
                list.add(num);
            }
        }
        return list;
    }

    public int solution(String S) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        char[] myChar = S.toCharArray();

        for (int i = 0; i < myChar.length; i++) {
            switch (myChar[i]) {
                case 'B':
                    b++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'N':
                    n++;
                    break;
            }
        }

        l /= 2;
        o /= 2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }

}
