package leetcode.difficulty.easy.problem_2160;

import java.util.Arrays;

public class Solution_2160 {
    public int minimumSum(int num) {
        String numberic = Integer.toString(num);
        String[] nums = numberic.split("");

        Arrays.sort(nums);

        String new1 = nums[0] + nums[2];
        String new2 = nums[1] + nums[3];

        return Integer.parseInt(new1) + Integer.parseInt(new2);
    }
}
