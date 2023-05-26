package leetcode.difficulty.easy.problem_2011;

public class Solution_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String val : operations) {
            if (val.equals("--X") || val.equals("X--")) {
                x -= 1;
            } else if (val.equals("++X") || val.equals("X++")) {
                x += 1;
            }
        }

        return x;
    }
}
