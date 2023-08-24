package leetcode.difficulty.easy.problem_2644;

public class Solution_2644 {
    public int maxDivScore(int[] nums, int[] divisors) {

        int divScore;
        int maxScore = 0;
        int result = Integer.MAX_VALUE;

        for (int divisor : divisors) {

            divScore = divScore(nums, divisor);

            if (divScore < maxScore) continue;

            if (divScore > maxScore) {
                maxScore = divScore;
                result = divisor;
                continue;
            }

            result = Math.min(result, divisor);
        }

        return result;
    }

    public int divScore(int[] nums, int divisor) {

        int score = 0;

        for (int num : nums) {

            if (num % divisor == 0) {
                score++;
            }
        }

        return score;
    }
}
