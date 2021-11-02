package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个由一些 闭区间 组成的列表，firstList 和 secondList ，其中 firstList[i] = [starti, endi] 而 secondList[j] = [startj, endj] 。每个区间列表都是成对 不相交 的，并且 已经排序 。
 * <p>
 * 返回这 两个区间列表的交集 。
 * <p>
 * 形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <= b 。
 * <p>
 * 两个闭区间的 交集 是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3] 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
 * 输出：[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 */
public class intervalIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) {
            int[][] res = new int[0][];
            return res;
        }
        int index1 = 0, index2 = 0, left = 0, right = 0, count = 0;
        List<Integer> list = new ArrayList<>();
        while (index1 < firstList.length && index2 < secondList.length) {
            left = Math.max(firstList[index1][0], secondList[index2][0]);
            right = Math.min(firstList[index1][1], secondList[index2][1]);
            if (left <= right) {
                list.add(left);
                list.add(right);
            }
            if (firstList[index1][1] < secondList[index2][1]) {
                index1++;
            } else if (firstList[index1][1] > secondList[index2][1]) {
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        int[][] res = new int[list.size() / 2][2];
        while (count < list.size()) {
            res[count / 2][0] = list.get(count++);
            res[count / 2][1] = list.get(count++);
        }
        return res;
    }
}
