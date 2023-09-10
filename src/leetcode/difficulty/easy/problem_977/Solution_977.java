package leetcode.difficulty.easy.problem_977;

public class Solution_977 {
    public int[] sortedSquares(int[] nums) {

        int fIndex = 0;
        int backIndex = nums.length - 1;
        int i = backIndex;
        int[] result = new int[nums.length];

        while (fIndex <= backIndex) {

            if (Math.abs(nums[fIndex]) > Math.abs(nums[backIndex])) {

                result[i] = nums[fIndex] * nums[fIndex++];
            } else {

                result[i] = nums[backIndex] * nums[backIndex--];
            }

            i--;
        }

        return result;
    }
}
