package leetcode.difficulty.easy.problem_2200;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution_2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> kDistant = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int maxIndex = Math.min(i+k, nums.length-1);

                for (int j = Math.max(i-k, 0); j <= maxIndex; j++) {
                    kDistant.add(j);
                }
            }
        }

        return new ArrayList<>(kDistant);
    }
}
