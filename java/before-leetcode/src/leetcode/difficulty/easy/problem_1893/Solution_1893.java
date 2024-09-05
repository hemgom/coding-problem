package leetcode.difficulty.easy.problem_1893;

import java.util.HashSet;
import java.util.Set;

public class Solution_1893 {
    Set<Integer> range = new HashSet<>();

    public boolean isCovered(int[][] ranges, int left, int right) {

        for (int[] r : ranges) {

            addInteger(r[0], r[1]);
        }

        for (int j = left; j <= right; j++) {

            if (!range.contains(j)) return false;
        }

        return true;
    }

    public void addInteger(int start, int end) {

        for (int i = start; i <= end; i++) {

            range.add(i);
        }
    }
}
