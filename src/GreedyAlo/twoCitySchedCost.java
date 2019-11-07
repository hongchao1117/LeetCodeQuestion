package GreedyAlo;

import java.util.Arrays;
import java.util.Comparator;

public class twoCitySchedCost {
    public static void main(String[] args) {
        int[][] costs = new int[][] {{10,20},{30,200},{400,50},{30,20}};
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));
        int cost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            cost += costs[i][0];
        }
        for (int i = costs.length / 2; i < costs.length; i++) {
            cost += costs[i][1];
        }
        System.out.println(cost);
    }
}
