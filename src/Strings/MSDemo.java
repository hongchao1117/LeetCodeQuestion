package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MSDemo {
    public static void main(String[] args) {
//        System.out.println(solution_1("zthzht"));

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(integerList.stream().filter(integer -> integer > 3).mapToInt(Integer::intValue).max().getAsInt());

    }

    private static int solution_1(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, flag = 0, res = 0;
        map.put(0, -1);
        for (char c : s.toCharArray()) {
            flag ^= 1 << ((c - 'a'));
            if (map.containsKey(flag)) {
                res = Math.max(res, count - map.get(flag));
            } else {
                map.put(flag, count);
            }
            count++;
        }
        return res;
    }

    public static int solution_3(int[] A, int[] B, int N) {
        boolean[] flag = new boolean[N];
        int temp;
        for (int i = 0; i < N; i++) {
            temp = Math.max(A[i], B[i]);
            if (temp <= N) {
                flag[temp - 1] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!flag[i]) {
                return i + 1;
            }
        }
        return N + 1;
    }
}
