package leetcode.difficulty.easy.problem_191;

public class Solution_191 {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;
    }
}
