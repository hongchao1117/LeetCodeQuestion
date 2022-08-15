package Test;

import java.util.Arrays;
import java.util.Stack;

/*
Given an array of integers prices represents the stock price,  return an array  such that  answer[i] is the number of days you have to wait after the  ith day to get a larger price. If there is no future day for which this is possible, keep answer == 0 instead.
Example 1:
Input: prices = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:
Input: prices = [30,40,50,60]
Output: [1,1,1,0]
Example 3:
Input: prices = [30,60,90]
Output: [1,1,0]

*/
public class DailyStockPrice {

    public int[] dailyStockPrice(int[] stocks) {
        if (stocks == null) {
            return new int[]{0};
        }
        int[] res = new int[stocks.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < stocks.length; i++) {
            while (!stack.isEmpty() && stocks[i] > stocks[stack.peek()]) {
                int temp = stack.pop();
                res[temp] = i - temp;
            }
            stack.push(i);
        }
        return res;
    }


    /*
A conveyor belt has packages that must be shipped from one port to another within n days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within n days.
Example 1:
Input: weights = [1,2,3,4,5,6,7,8,9,10], n = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10
Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
*/
// f(Cap) <= n < f(Cap - 1)

    public static int minCapacity(int[] weights, int n) {
        if (weights == null || weights.length == 0 || n <= 0) return -1;
        //binary search 找到左右边界
        //左边界为 单个max重量，右边界为 weights中的元素之和
        int left = Arrays.stream(weights).max().getAsInt(), right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = (left + right) / 2;
            //need 为需要运送的天数
            //curWeight 为当前这天已经运送的包裹重量之和
            int need = 1, curWeight = 0;
            for (int weight : weights) {
                if (weight + curWeight > mid) {
                    need++;
                    curWeight = 0;
                }
                curWeight += weight;
            }
            if (need <= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        minCapacity(nums, 5);

    }
}
