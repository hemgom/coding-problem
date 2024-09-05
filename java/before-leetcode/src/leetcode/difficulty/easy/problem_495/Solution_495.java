package leetcode.difficulty.easy.problem_495;

public class Solution_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int poisonSecond = 0;
        int totalSecond = -1;

        for (int t : timeSeries) {

            poisonSecond += duration;

            if (totalSecond >= t) {

                poisonSecond -= (totalSecond - t + 1);
            }

            totalSecond = (t + duration) - 1;
        }

        return poisonSecond;
    }
}
