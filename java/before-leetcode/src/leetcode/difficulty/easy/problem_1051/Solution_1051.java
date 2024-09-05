package leetcode.difficulty.easy.problem_1051;

import java.util.Arrays;

public class Solution_1051 {
    public int heightChecker(int[] heights) {

        int[] origin = new int[heights.length];
        int diffCount = 0;

        for (int i = 0; i < heights.length; i++) {
            origin[i] = heights[i];
        }

        Arrays.sort(heights);

        for (int j = 0; j < heights.length; j++) {

            if (heights[j] != origin[j]) {
                diffCount++;
            }
        }

        return diffCount;
    }
}
