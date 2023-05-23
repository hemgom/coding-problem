package leetcode.difficulty.easy.problem_121;

public class Solution_121 {
    public int maxProfit(int[] prices) {
        int sub = 0;
        int subMax = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            sub = prices[i] - minPrice;

            if (sub > subMax) {
                subMax = sub;
            }
        }

        return subMax;
    }
}
