package leetcode.difficulty.easy.problem_2367;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        List<Integer> numList = new ArrayList<>();
        numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (numList.contains(nums[i] + diff)) {
                count += checkArtithmeticTriplet(numList, nums[i] + (diff * 2));
            }
        }

        return count;
    }

    public int checkArtithmeticTriplet(List<Integer> numList, int num) {
        int tripletCount = 0;

        if (numList.contains(num)) {
            tripletCount = 1;
        }

        return tripletCount;
    }
}
