package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElementTest {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4};
        int[] nums2 = new int[]{1,2,3,4};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
//        int[] res = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            res[i] = getNums(nums1[i], nums2);
//        }

//        System.out.println(Arrays.toString(res));
    }
//
//    private static int getNums(int num, int[] nums2) {
//        for (int j = 0; j < nums2.length; j++) {
//            if (num == nums2[j]) {
//                for (int i = j + 1; i < nums2.length; i++) {
//                    if (num < nums2[i]) {
//                        return nums2[i];
//                    }
//                }
//            }
//        }
//        return -1;

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int[] res = new int[nums1.length];
        for (int num:nums2) {
            while (!stack.isEmpty() && stack.peek()<num){
                int a = stack.pop();
                hashMap.put(a,num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            res[i] = hashMap.getOrDefault(nums1[i],-1);
        }

        return res;
    }

    }
