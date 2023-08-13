package leetcode.difficulty.easy.problem_724;

public class Solution_724 {
    public int pivotIndex(int[] nums) {

        int sumLeft = 0;
        int sumNums = 0;

        for (int num : nums) {
            sumNums += num;
        }

        for (int i = 0; i < nums.length; i++) {

            if (sumLeft * 2 == sumNums - nums[i]) {
                return i;
            }

            sumLeft += nums[i];
        }

        return -1;
    }
}
