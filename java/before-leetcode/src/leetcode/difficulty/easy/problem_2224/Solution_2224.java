package leetcode.difficulty.easy.problem_2224;

public class Solution_2224 {
    public int convertTime(String current, String correct) {
        int currentMinutes = timeToMinutes(current);
        int correctMinutes = timeToMinutes(correct);
        int subMinutes = 0;
        int count = 0;

        if (correctMinutes < currentMinutes) {
            subMinutes = 1440 - currentMinutes + correctMinutes;
        } else {
            subMinutes = correctMinutes - currentMinutes;
        }

        while (subMinutes != 0) {
            if (subMinutes >= 60) {
                count += subMinutes / 60;
                subMinutes = subMinutes % 60;
            } else if (subMinutes >= 15) {
                count += subMinutes / 15;
                subMinutes = subMinutes % 15;
            } else if (subMinutes >= 5) {
                count += subMinutes / 5;
                subMinutes = subMinutes % 5;
            } else {
                count += subMinutes;
                subMinutes = 0;
            }
        }

        return count;
    }

    public int timeToMinutes(String time) {
        String[] hourAndMinute = time.split(":");
        int minutes = 0;

        minutes += Integer.parseInt(hourAndMinute[0]) * 60;
        minutes += Integer.parseInt(hourAndMinute[1]);

        return minutes;
    }
}
