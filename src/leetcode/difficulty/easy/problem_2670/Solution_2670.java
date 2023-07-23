package leetcode.difficulty.easy.problem_2670;

import java.util.HashSet;
import java.util.Set;

public class Solution_2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] diff = new int[nums.length];
        int frontUniqCount = 0;
        int backUniqCount = 0;

        for (int i = 0; i < nums.length; i++) {
            frontUniqCount = frontCount(nums, i);
            backUniqCount = backCount(nums, i);
            diff[i] = frontUniqCount - backUniqCount;
        }

        return diff;
    }

    public int frontCount(int[] nums, int i) {
        Set<Integer> uniqElements = new HashSet<>();

        for (int j = 0; j <= i; j++) {
            uniqElements.add(nums[j]);
        }

        return uniqElements.size();
    }

    public int backCount(int[] nums, int i) {
        Set<Integer> uniqElements = new HashSet<>();

        for (int j = i+1; j < nums.length; j++) {
            uniqElements.add(nums[j]);
        }

        return uniqElements.size();
    }
}
