package leetcode.difficulty.easy.problem_2144;

import java.util.Arrays;

public class Solution_2144 {
    public int minimumCost(int[] cost) {
        int price = 0;
        int count = 0;

        Arrays.sort(cost);

        for (int i = cost.length-1; i >= 0; i--) {
            if (count < 2) {
                price += cost[i];
                count++;
            } else if (count == 2) {
                count = 0;
            }
        }

        return price;
    }
}
