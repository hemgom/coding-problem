package leetcode.difficulty.easy.problem_303;

public class Solution_303 {
    int[] nums;

    public Solution_303(int[] nums) {
        this.nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = nums[i];
        }
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int j = left; j <= right; j++) {
            result += nums[j];
        }
        return result;
    }
}
