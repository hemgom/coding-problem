package leetcode.difficulty.easy.problem_283;

public class Solution_283 {
    public void moveZeroes(int[] nums) {
        int count = notZeroCount(nums);
        int[] notZeroNums = notZero(nums, count);

        for (int j = 0; j < count; j++) {
            nums[j] = notZeroNums[j];
        }

        for (int k = count; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    public int notZeroCount(int[] nums) {
        int notZeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                notZeroCount += 1;
            }
        }

        return notZeroCount;
    }

    public int[] notZero(int[] nums, int count) {
        int[] notZeroNums = new int[count];
        int i = 0;

        for (int num : nums) {
            if (num != 0) {
                notZeroNums[i] = num;
                i += 1;
            }
        }

        return notZeroNums;
    }
}
