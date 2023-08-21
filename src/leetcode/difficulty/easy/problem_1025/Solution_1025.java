package leetcode.difficulty.easy.problem_1025;

public class Solution_1025 {
    public boolean divisorGame(int n) {

        if (n == 1) return false;

        int playCount = 0;
        int x = n - 1;

        while (n != x) {

            if (n % x == 0) {

                playCount++;
                n -= x;
            } else {

                x--;
            }
        }

        if (playCount % 2 == 1) {

            return true;
        }

        return false;
    }
}
