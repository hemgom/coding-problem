package leetcode.difficulty.easy.problem_2652;

public class Solution_2652 {
    public int sumOfMultiples(int n) {

        if (n < 3) {
            return 0;
        }

        int result = 0;

        for (int i = 3; i <= n; i++) {

            if (i % 3 == 0) {
                result += i;
                continue;
            }

            if (i % 5 == 0) {
                result += i;
                continue;
            }

            if (i % 7 == 0) {
                result += i;
            }
        }

        return result;
    }
}
