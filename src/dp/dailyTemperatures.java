package dp;

import java.util.ArrayDeque;
import java.util.Deque;

public class dailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        if (T == null) return null;
        /** int[] res = new int[T.length];
         for (int i = 0; i < T.length - 1; i++) {
         int count = 0;
         for (int j = i + 1; j < T.length; j++) {
         if (T[j] <= T[i]) {
         continue;
         }else{
         count = j - i;
         break;
         }
         }
         res[i] = count;
         }
         return res; */
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int temp = stack.pop();
                res[temp] = i - temp;
            }
            stack.push(i);
        }
        return res;
    }
}
