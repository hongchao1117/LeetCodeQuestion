package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//欢迎洪超参加蚂蚁集团-CTO-技术风险部笔试

//评测题目1: 两个有序列表组合成一个有序列表返回, 其中存在重复数字，合并后的列表去重
// 如[1,2,2,5,9], [2,3,3,5,8,10]
// 合并后 [1,2,3,5,8,9,10]，不能使用Set或List自带的排序方法

public class aliDemo {

    public static void main(String[] args) {
        System.out.println(mergeList(Arrays.asList(1, 2, 9), Arrays.asList(2, 10)));
    }

    public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        int len1 = list1.size(), len2 = list2.size();
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (list1.get(i) > list2.get(j)) {
                if (!res.contains(list2.get(j))) {
                    res.add(list2.get(j));
                }
                j++;
            } else {
                if (!res.contains(list1.get(i))) {
                    res.add(list1.get(i));
                }
                i++;
            }
        }
        while (i < len1) {
            if (!res.contains(list1.get(i))) {
                res.add(list1.get(i));
            }
            i++;
        }
        while (j < len2) {
            if (!res.contains(list2.get(j))) {
                res.add(list2.get(j));
            }
            j++;
        }
        return res;
    }

    //评测题目2：整数查找
//输入：一个有序数组array，一个整数n输出：如果n在array里，输出n的位置；
//如果n不在array中输出n可以插入的位置，插入后的数组仍然有序，例如：
//
//* [1,3,5,6], 5 → 2
//* [1,3,5,6], 2 → 1
//* [1,3,5,6], 7 → 4
//* [1,3,5,6], 0 → 0
//* [1,3,5,6], 4 → 2

    public static int searchNum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
