package leetcode.difficulty.easy.problem_342;

public class Solution_342 {
    public boolean isPowerOfFour(int n) {

        if (n == 0) return false;

        while (n != 1) {

            if (n % 4 != 0) return false;

            n /= 4;
        }

        return true;
    }
}
