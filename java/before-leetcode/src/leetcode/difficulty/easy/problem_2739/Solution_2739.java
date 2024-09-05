package leetcode.difficulty.easy.problem_2739;

public class Solution_2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int distance = 0;
        int useOil = 0;

        while (mainTank != 0) {

            distance += 10;
            mainTank--;
            useOil++;

            if (useOil != 5) continue;
            useOil = 0;

            if (additionalTank > 0) {

                mainTank++;
                additionalTank--;
            }
        }

        return distance;
    }
}
