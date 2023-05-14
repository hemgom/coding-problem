package leetcode.difficulty.easy;

public class Solution_2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] index = new int[mat.length];
        int[] result = { index[0], 0 };
        int maxIndex = 0;
        int value = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    index[i] += 1;
                }
            }
        }

        for (int k = 0; k < index.length; k++) {
            if (value < index[k]) {
                value = index[k];
                maxIndex = k;
            }
        }

        result[0] = maxIndex;
        result[1] = index[result[0]];

        return result;
    }
}
