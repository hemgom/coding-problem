package leetcode.difficulty.easy.problem_509;

public class Solution_509 {
    public int fib(int n) {

        if (n == 0 || n == 1) return n;

        return fib(n-1) + fib(n-2);
    }
}
