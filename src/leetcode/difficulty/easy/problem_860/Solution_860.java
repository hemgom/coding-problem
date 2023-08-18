package leetcode.difficulty.easy.problem_860;

public class Solution_860 {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
                continue;
            }

            if (bill == 10) {
                ten++;
                five--;

                if (five < 0) return false;

                continue;
            }

            if (bill == 20) {

                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }

                if (five < 0 || ten < 0) return false;
            }
        }

        return true;
    }
}
