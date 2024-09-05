package leetcode.difficulty.easy.problem_1598;

public class Solution_1598 {
    public int minOperations(String[] logs) {

        int location = 0;

        for (String log : logs) {

            if (log.equals("./")) continue;

            if (log.equals("../")) {

                if (location > 0) {
                    location--;
                }

                continue;
            }

            location++;
        }

        return location;
    }
}
