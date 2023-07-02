package leetcode.difficulty.easy.problem_202;

import java.util.HashSet;
import java.util.Set;

public class Solution_202 {
    public boolean isHappy(int n) {
        Set<Integer> sums = new HashSet<>();

        n = sumOfSquare(n);

        while (n != 1 && !sums.contains(n)) {
            sums.add(n);
            n = sumOfSquare(n);
        }

        return 1 == n;
    }

    public int sumOfSquare(int n) {
        int square = 0;
        int sum = 0;

        while (n > 0) {
            square = n % 10;
            sum += square * square;
            n /= 10;
        }

        return sum;
    }
}
