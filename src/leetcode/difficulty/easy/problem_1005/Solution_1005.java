package leetcode.difficulty.easy.problem_1005;

public class Solution_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int minNum = nums[0];
        int minIndex = 0;
        int sum = 0;

        while (k != 0) {
            for (int i = 1; i < nums.length; i++) {
                if (minNum > nums[i]) {
                    minNum = nums[i];
                    minIndex = i;
                }
            }
            nums[minIndex] = -minNum;
            k -= 1;
            minNum = nums[0];
            minIndex = 0;
        }

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }

        return sum;
    }
}
