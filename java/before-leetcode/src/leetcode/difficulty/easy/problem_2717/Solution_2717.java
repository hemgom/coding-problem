package leetcode.difficulty.easy.problem_2717;

public class Solution_2717 {
    public int semiOrderedPermutation(int[] nums) {

        int oneIndex = -1;
        int nIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 1 && nums[i] != nums.length) continue;

            if (nums[i] == 1) oneIndex = i;

            if (nums[i] == nums.length) nIndex = i;
        }

        if (oneIndex < nIndex) {
            return oneIndex + (nums.length-1 - nIndex);
        }

        return oneIndex + (nums.length-1 - nIndex) -1;
    }
}
