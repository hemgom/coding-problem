package leetcode.difficulty.easy.problem_2032;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution_2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        return Stream.concat(intersection(nums1, nums2).stream(),
                        Stream.concat(intersection(nums1, nums3).stream(), intersection(nums2, nums3).stream()))
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Integer> intersection(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(aValue -> Arrays.stream(b).anyMatch(bValue -> aValue == bValue))
                .boxed()
                .collect(Collectors.toList());
    }
}
