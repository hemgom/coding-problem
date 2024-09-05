package leetcode.difficulty.easy.problem_1475;

public class Solution_1475 {
    public int[] finalPrices(int[] prices) {

        for(int i = 0; i < prices.length - 1; i++) {
            prices[i] = discountPrice(prices, i, prices[i]);
        }

        return prices;
    }

    public int discountPrice(int[] prices, int index, int price) {

        for(int j = index + 1; j < prices.length; j++) {
            if (price >= prices[j]) {
                return price - prices[j];
            }
        }

        return price;
    }
}
