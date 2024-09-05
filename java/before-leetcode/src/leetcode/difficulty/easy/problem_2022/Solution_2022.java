package leetcode.difficulty.easy.problem_2022;

public class Solution_2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {

        int ol = original.length;

        if (ol != m * n) return new int[0][0];

        int[][] reformat = new int[m][n];

        int line = 0;
        int row = 0;
        int i = 0;
        while (i != ol) {

            reformat[line][row] = original[i];

            row++;

            if (row >= n) {
                line++;
                row = 0;
            }

            i++;
        }

        return reformat;
    }
}
