package leetcode.difficulty.easy.problem_2016;

public class Solution_2016 {
    public int maximumDifference(int[] nums) {
        int subResult = 0;
        int maxNum = -1;

        for (int i = 0; i < nums.length-1; i++) {
            subResult = maxSubNum(nums, i, nums[i]);
            maxNum = maxNum < subResult ? subResult : maxNum;
        }

        return maxNum;
    }

    public int maxSubNum(int[] nums, int index, int valueOfArray) {
        int result = 0;
        int maxSub = 0;

        for (int j = index+1; j < nums.length; j++) {
            result = nums[j] - valueOfArray;
            maxSub = maxSub < result ? result : maxSub;
        }

        if (maxSub <= 0) {
            return -1;
        } else {
            return maxSub;
        }
    }
}
