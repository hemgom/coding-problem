package leetcode.difficulty.easy.problem_2124;

public class Solution_2124 {
    public boolean checkString(String s) {

        if (s.indexOf("a") == -1) return true;

        if (s.indexOf("b") == -1) return true;

        return !s.contains("ba");
    }
}
