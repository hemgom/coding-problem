package leetcode.difficulty.easy.problem_766;

public class Solution_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {

        if (matrix.length == 1 || matrix[0].length == 1) return true;

        for (int i = matrix.length-1; i >= 0; i--) {

            if (!check(matrix, i, 0)) return false;
        }

        for (int j = 1; j < matrix[0].length; j++) {

            if (!check(matrix, 0, j)) return false;
        }

        return true;
    }

    public boolean check(int[][] matrix, int lineIndex, int rowIndex) {

        int value = matrix[lineIndex++][rowIndex++];

        while (lineIndex < matrix.length && rowIndex < matrix[0].length) {

            if (value != matrix[lineIndex++][rowIndex++]) return false;
        }

        return true;
    }
}
