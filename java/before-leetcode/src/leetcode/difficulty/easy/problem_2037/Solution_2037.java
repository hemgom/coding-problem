package leetcode.difficulty.easy.problem_2037;

import java.util.Arrays;

public class Solution_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {

        int moveCount = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {

            moveCount += Math.abs(seats[i] - students[i]);
        }

        return moveCount;
    }
}
