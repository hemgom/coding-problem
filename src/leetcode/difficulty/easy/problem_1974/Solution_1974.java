package leetcode.difficulty.easy.problem_1974;

public class Solution_1974 {
    public int minTimeToType(String word) {

        int pointer = 'a';
        int target;
        int time = 0;
        int forward;

        for (int i = 0; i < word.length(); i++) {
            target = word.charAt(i);

            if (target == pointer) {
                time++;
                continue;
            }

            forward = Math.abs(target - pointer);

            time += Math.min(forward, 26 - forward) + 1;
            pointer = target;
        }

        return time;
    }
}
