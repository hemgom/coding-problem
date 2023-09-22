package leetcode.difficulty.easy.problem_1629;

public class Solution_1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int longPressTime = 0;
        int beforeTime = 0;
        int key = 0;
        int time;

        for (int i = 0; i < releaseTimes.length; i++) {

            time = releaseTimes[i] - beforeTime;
            beforeTime = releaseTimes[i];

            if (longPressTime < time) {

                longPressTime = time;
                key = keysPressed.charAt(i);

            } else if (longPressTime == time) {

                key = Math.max(key, keysPressed.charAt(i));

            }
        }

        return (char) key;
    }
}
