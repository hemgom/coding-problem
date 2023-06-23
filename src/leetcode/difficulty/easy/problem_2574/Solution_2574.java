package leetcode.difficulty.easy.problem_2574;

public class Solution_2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum(nums, i) - rightSum(nums,i));
        }

        return answer;
    }

    public int leftSum(int[] nums, int i) {
        int index = 0;
        int result = 0;

        while (index != i) {
            result += nums[index];
            index++;
        }

        return result;
    }

    public int rightSum(int[] nums, int i) {
        int index = nums.length - 1;
        int result = 0;

        while (index != i) {
            result += nums[index];
            index--;
        }

        return result;
    }
}
