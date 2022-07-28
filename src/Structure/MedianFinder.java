package Structure;

import java.util.PriorityQueue;

/**
 * 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
 * <p>
 * 例如，
 * <p>
 * [2,3,4] 的中位数是 3
 * <p>
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 * <p>
 * 设计一个支持以下两种操作的数据结构：
 * <p>
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 * 示例：
 * <p>
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 */
public class MedianFinder {
    PriorityQueue<Integer> pqMax;
    PriorityQueue<Integer> pqMin;

    public MedianFinder() {
        pqMax = new PriorityQueue<>((a, b) -> (a - b));
        pqMin = new PriorityQueue<>((a, b) -> (b - a));
    }

    public void addNum(int num) {
        if (pqMin.isEmpty() || num <= pqMin.peek()) {
            pqMin.add(num);
            if (pqMax.size() + 1 < pqMin.size()) {
                pqMax.add(pqMin.poll());
            }
        } else {
            pqMax.add(num);
            if (pqMax.size() > pqMin.size()) {
                pqMin.add(pqMax.poll());
            }
        }
    }

    public double findMedianNum() {
        if (pqMin.size() > pqMax.size()) {
            return pqMin.peek();
        }
        return (pqMax.peek() + pqMin.peek()) / 2.0;
    }

}
