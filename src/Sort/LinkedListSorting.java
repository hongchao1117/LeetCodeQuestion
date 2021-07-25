package Sort;

import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr = {5, 3, 1, 2, 5, 3, 4, 6, 7, 9, 8, 9, 0};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        String s = "hongchao" + 2;
        System.out.println(s);
        qSort(list, 0, arr.length - 1);
        System.out.println(list.toString());
    }

    private static void qSort(LinkedList<Integer> list, int left, int right) {
        if (left < right) {
            int i = left;
            int j = i + 1;
            int x = list.get(i);//基准数字
            while (j <= right) {//大循环，j不能超过链表长度
                //如果j指向的值大于等于基准数字，则直接跳过
                while (j <= right && list.get(j) >= x) {
                    j++;
                }
                //否则，j指向的值小于基准，则交换
                if (j <= right) {
                    i++;//交换时，i首先要向后移动一位
                    swapHelper(list, i, j);
                    j++;
                }
            }
            swapHelper(list, left, i);//最后，交换i位置和基准元素
            qSort(list, left, i - 1);//递归排序左边
            qSort(list, i + 1, right);//递归排序右边
        }

    }

    private static void swapHelper(LinkedList<Integer> list, int i, int j) {
        int t = list.get(j);
        list.set(j, list.get(i));
        list.set(i, t);
    }
}
