package leetcode.difficulty.easy.problem_2395;

import java.util.HashSet;
import java.util.Set;

public class Solution_2395 {
    public boolean findSubarrays(int[] nums) {
        int checkResult = 0;
        Set<Integer> elementSum = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (!elementSum.add(nums[i] + nums[i+1])) {
                checkResult = 1;
                break;
            }
        }

        return checkResult == 1;
    }
}
