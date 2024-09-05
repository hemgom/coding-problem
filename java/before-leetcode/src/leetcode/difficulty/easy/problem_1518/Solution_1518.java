package leetcode.difficulty.easy.problem_1518;

public class Solution_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drinkCount = 0;
        int empty = 0;

        while (numBottles != 0) {

            drinkCount += numBottles;
            empty += numBottles;

            numBottles = empty / numExchange;
            empty %= numExchange;
        }

        return drinkCount;
    }
}
