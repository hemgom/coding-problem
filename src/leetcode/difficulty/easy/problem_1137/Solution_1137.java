package leetcode.difficulty.easy.problem_1137;

public class Solution_1137 {
    public int tribonacci(int n) {
        int tN = 0;
        int tA, tB, tC;

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        tA = 0;
        tB = 1;
        tC = 1;

        for (int i = 3; i <= n; i++) {
            tN = tA + tB + tC;
            tA = tB;
            tB = tC;
            tC = tN;
        }

        return tN;
    }
}
