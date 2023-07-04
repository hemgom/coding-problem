package leetcode.difficulty.easy.problem_1512;

public class Solution_1512 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            result += numCheckSame(nums, nums[i], i);
        }

        return result;
    }

    public int numCheckSame(int[] nums, int num, int index) {
        int sameCount = 0;

        for (int i = index + 1; i < nums.length; i++) {
            if (num == nums[i]) {
                sameCount++;
            }
        }

        return sameCount;
    }
}
