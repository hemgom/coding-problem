package leetcode.difficulty.easy.problem_169;

import java.util.HashSet;
import java.util.Set;

public class Solution_169 {
    public int majorityElement(int[] nums) {
        int standardNum = nums.length / 2;
        if (nums.length % 2 == 1) {
            standardNum++;
        }

        int count = 0;
        int result = 0;
        for (int kind : elementKind(nums)) {
            count = elementCount(nums, kind);
            if (count >= standardNum) {
                result = kind;
            }
        }

        return result;
    }

    public Set<Integer> elementKind(int[] nums) {
        Set<Integer> ek = new HashSet<>();

        for (int num : nums) {
            ek.add(num);
        }

        return ek;
    }

    public int elementCount(int[] nums, int kind) {
        int count = 0;

        for (int num : nums) {
            if (kind == num) {
                count++;
            }
        }

        return count;
    }
}
