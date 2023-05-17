package leetcode.difficulty.easy.problem_2639;

public class Solution_2639 {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        int j = 0;
        int intLength, result;

        while (j < grid[0].length) {
            intLength = 0;
            result = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] < 0) {
                    intLength = (int)Math.log10(-grid[i][j])+2;
                } else if (grid[i][j] > 0) {
                    intLength = (int)Math.log10(grid[i][j])+1;
                } else if (grid[i][j] == 0) {
                    intLength = 1;
                }
                result = result < intLength ? intLength : result ;
            }
            ans[j] = result;
            j += 1;
        }
        return ans;
    }
}
