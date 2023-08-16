package leetcode.difficulty.easy.problem_1784;

public class Solution_1784 {
    public boolean checkOnesSegment(String s) {

        if (s.contains("01")) {
            return false;
        }

        return true;
    }
}