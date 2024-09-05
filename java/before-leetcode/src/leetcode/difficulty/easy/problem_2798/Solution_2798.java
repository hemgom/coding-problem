package leetcode.difficulty.easy.problem_2798;

public class Solution_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int finishEmployee = 0;

        for (int h : hours) {

            if (target <= h) {
                finishEmployee++;
            }
        }

        return finishEmployee;
    }
}
