package leetcode.difficulty.easy.problem_448;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> distinctNums = new HashSet<Integer>();

        for (int num : nums) {
            distinctNums.add(num);
        }

        List<Integer> notAppearNums = new LinkedList<Integer>();

        for (int i = 1; i <= nums.length; i++) {
            if (!distinctNums.contains(i)) {
                notAppearNums.add(i);
            }
        }

        return notAppearNums;
    }
}
