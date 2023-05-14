package leetcode.difficulty.easy;

public class Solution_2582 {
    public int passThePillow(int n, int time) {
        int r = time / (n - 1);
        int m = time % (n - 1);
        int result = 0;

        if (r%2 == 0) {
            result = 1 + m;
        } else if (r%2 == 1) {
            result = n - m;
        }
        return result;
    }
}
