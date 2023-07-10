package leetcode.difficulty.easy.problem_1337;

import java.util.Arrays;

public class Solution_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] oneCount = new int[mat.length];
        int[] oneCountSort = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            oneCount[i] = countOfOne(mat, i);
            oneCountSort[i] = countOfOne(mat, i);
        }

        Arrays.sort(oneCountSort);

        int[] result = new int[k];

        for (int j = 0; j < k; j++) {
            result[j] = oneCountIndex(oneCount, oneCountSort[j]);
            oneCount[result[j]] = -1;
        }

        return result;
    }

    public int countOfOne(int[][] mat, int rowIndex) {
        int count = 0;

        int j = 0;
        while (j < mat[rowIndex].length) {
            if (mat[rowIndex][j] == 1) {
                count++;
            }

            j++;
        }

        return count;
    }

    public int oneCountIndex(int[] oneCount, int value) {
        int valueIndex = 0;

        for (int i = 0; i < oneCount.length; i++) {
            if (oneCount[i] == value) {
                valueIndex = i;
                break;
            }
        }

        return valueIndex;
    }
}
