package leetcode.difficulty.easy.problem_1822;

public class Solution_1822 {

    public int arraySign(int[] nums) {

        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            if (num < 0) {
                negativeCount++;
            }
        }

        int checkEvenNumber = negativeCount % 2;

        if (checkEvenNumber != 0) {
            return -1;
        }

        return 1;
    }
}
