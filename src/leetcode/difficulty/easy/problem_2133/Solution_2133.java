package leetcode.difficulty.easy.problem_2133;

import java.util.HashSet;
import java.util.Set;

public class Solution_2133 {
    public boolean checkValid(int[][] matrix) {

        for (int j = 0; j < matrix.length; j++) {
            if (!checkLine(matrix, j)) {
                return false;
            }

            if (!checkRow(matrix, j)) {
                return false;
            }
        }

        return true;
    }

    public boolean checkLine(int[][] matrix, int fixLine) {

        Set<Integer> e = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            if (!e.add(matrix[fixLine][i])) {
                return false;
            }
        }

        return true;
    }

    public boolean checkRow(int[][] matrix, int fixRow) {

        Set<Integer> e = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            if (!e.add(matrix[i][fixRow])) {
                return false;
            }
        }

        return true;
    }
}
