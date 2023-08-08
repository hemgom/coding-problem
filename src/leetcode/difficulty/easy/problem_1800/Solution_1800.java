package leetcode.difficulty.easy.problem_1800;

public class Solution_1800 {
    public int maxAscendingSum(int[] nums) {

        int previousNum = 0;
        int subArraySum = 0;
        int maxSubArraySum = 0;

        for (int num : nums) {
            if (previousNum < num) {
                subArraySum += num;
            } else {
                subArraySum = num;
            }

            previousNum = num;

            if (maxSubArraySum < subArraySum) {
                maxSubArraySum = subArraySum;
            }
        }

        return maxSubArraySum;
    }
}
