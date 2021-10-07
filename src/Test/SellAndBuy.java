package Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * // 有两个List， A 和 B。 A代表的是买入列表（买入份数、单价，时间），B代表的是卖出列表（卖出份数，单价，时间）
 * // 计算：剩余的总份数以及剩余部分的买入总成本。
 * //
 * // 一个例子：
 * // 买入list :
 * // 第一次： <1000, 1.5, 2021-01-01>
 * // 第二次： <1000, 2.1, 2021-01-05>
 * // 第三次： <1000, 1.7, 2021-01-07>
 * // 第四次： <1000, 1.1, 2021-01-09>
 * <p>
 * // 卖出list :
 * // 第一次： <2500, 2.2, 2021-01-08>
 * <p>
 * // 则结果为：
 * // <1500, 1950>
 * <p>
 * // 要求：先买的会被先卖;
 */
public class SellAndBuy {
    public static void main(String[] args) {
        ArrayList<FundObj> listA = new ArrayList<>();
        listA.add(new FundObj(1000, 1.5, new Date("2021-01-01")));
        listA.add(new FundObj(1000, 2.1, new Date("2021-01-01")));
        listA.add(new FundObj(1000, 1.7, new Date("2021-01-01")));
        listA.add(new FundObj(1000, 1.1, new Date("2021-01-01")));
        ArrayList<FundObj> listB = new ArrayList<>();
        listB.add(new FundObj(2500, 2.2, new Date("2021-01-08")));
        Map<Integer, Double> res = getRes(listA, listB);
        System.out.println(res.toString());

    }

    public static Map<Integer, Double> getRes(ArrayList<FundObj> listA, ArrayList<FundObj> listB) {
        Map<Integer, Double> map = new HashMap<>();
        if (listA == null) return null;
        int lenA = listA.size();
        int lenB = listB.size();
        int countA = 0, countB = 0;
        int sumParts = 0;//剩余份数
        double cost = 0;//花费总金额
        while (countA < lenA && countB < lenB) {
            Date tempA = listA.get(countA).time;
            Date tempB = listA.get(countB).time;
            //如果购买时间早于卖出时间
            if (tempA.before(tempB)) {
                sumParts += listA.get(countA).parts;
                cost += (listA.get(countA).price) * (listA.get(countA).parts);
                countA++;
            } else {
                if (sumParts < 0) {
                    return map;
                } else {
                    sumParts -= listB.get(countB).parts;
                    if (sumParts < 0) {
                        return map;
                    }
                    cost -= (listB.get(countB).price) * (listB.get(countB).parts);
                    countB++;
                }
            }
        }
        while (countA < lenA) {
            sumParts += listA.get(countA).parts;
            cost += (listA.get(countA).price) * (listA.get(countA).parts);
            countA++;
        }
        while (countB < lenB) {
            sumParts -= listB.get(countB).parts;
            if (sumParts < 0) {
                return map;
            }
            cost -= (listB.get(countB).price) * (listB.get(countB).parts);
            countB++;
        }
        map.put(sumParts, cost);
        return map;
    }
}

class FundObj {
    int parts;
    double price;
    Date time;

    public FundObj(int parts, double price, Date time) {
        this.parts = parts;
        this.price = price;
        this.time = time;
    }
}
