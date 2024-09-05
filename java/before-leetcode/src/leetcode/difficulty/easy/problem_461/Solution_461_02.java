package leetcode.difficulty.easy.problem_461;

public class Solution_461_02 {
    public int hammingDistance(int x, int y) {
        int hammingDistance = 0;

        while (x > 0 || y > 0) {
            if (x % 2 != y % 2) {
                hammingDistance++;
            }
            x /= 2;
            y /= 2;
        }

        return hammingDistance;
    }
}
