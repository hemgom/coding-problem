package leetcode.difficulty.easy.problem_594;

import java.util.Arrays;

public class Solution_594 {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int operandA = 0;
        int operandB = 1;
        int biggestLength = 0;

        while (operandB < nums.length) {

            int subValue = nums[operandB] - nums[operandA];

            if (subValue == 1) {
                biggestLength = Math.max(biggestLength, operandB - operandA + 1);
            }

            if (subValue <= 1) {
                operandB++;
            } else {
                operandA++;
            }
        }

        return biggestLength;
    }
}
