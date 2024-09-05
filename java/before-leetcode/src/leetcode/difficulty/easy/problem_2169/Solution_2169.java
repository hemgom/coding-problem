package leetcode.difficulty.easy.problem_2169;

public class Solution_2169 {
    public int countOperations(int num1, int num2) {
        int a = num1;
        int b = num2;
        int count = 0;

        while (true) {
            if (a != 0 && b != 0) {
                if (a >= b) {
                    a -= b;
                } else if (a < b) {
                    b -= a;
                }
                count += 1;
            } else {
                break;
            }
        }

        return count;
    }
}
