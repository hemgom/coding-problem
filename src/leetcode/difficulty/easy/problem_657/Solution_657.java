package leetcode.difficulty.easy.problem_657;

public class Solution_657 {
    public boolean judgeCircle(String moves) {

        char[] move = moves.toCharArray();
        int x = 0;
        int y = 0;

        for (char m : move) {

            if (m == 'R') {
                x++;
            } else if (m == 'L') {
                x--;
            } else if (m == 'U') {
                y++;
            } else if (m == 'D'){
                y--;
            }
        }

        return x == 0 && y == 0;
    }
}
