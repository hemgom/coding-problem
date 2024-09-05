package leetcode.difficulty.easy.problem_35;

import java.util.Arrays;

public class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int targetIndex;

        if (Arrays.asList(nums).contains(target)) {
            targetIndex = Arrays.asList(nums).indexOf(target);
        } else {
            targetIndex = addTarget(nums, target);
        }

        return targetIndex;
    }

    public int addTarget(int[] nums, int target) {
        int targetIndex;

        if (nums[nums.length-1] < target) {
            int subValue = target - nums[nums.length-1];
            targetIndex = nums.length;
        } else {
            int index = 0;
            while (nums[index] < target) {
                index++;
            }
            targetIndex = index;
        }

        return targetIndex;
    }
}
