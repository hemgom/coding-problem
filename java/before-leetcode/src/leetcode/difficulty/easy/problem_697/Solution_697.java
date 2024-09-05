package leetcode.difficulty.easy.problem_697;

import java.util.HashMap;

public class Solution_697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{i, i, 1});
            } else {
                int[] keyValue = map.get(nums[i]);
                keyValue[1] = i;
                keyValue[2]++;
                map.put(nums[i], keyValue);
            }
        }

        int keyCount = 0;
        int smallestLength = nums.length;
        for (int[] value : map.values()) {
            if (value[2] > keyCount) {
                keyCount = value[2];
                smallestLength = value[1] - value[0] + 1;
            } else if (value[2] == keyCount) {
                smallestLength = Math.min(smallestLength, value[1] - value[0] + 1);
            }
        }

        return smallestLength;
    }
}
