package leetcode.difficulty.easy.problem_551;

public class Solution_551 {
    public boolean checkRecord(String s) {
        if (s.contains("LLL")) {
            return false;
        }

        int absentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (absentCount == 2) {
                break;
            }

            if (s.charAt(i) == 'A') {
                absentCount++;
            }
        }

        if (absentCount == 2) {
            return false;
        }

        return true;
    }
}
