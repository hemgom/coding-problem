package leetcode.difficulty.easy.problem_1758;

public class Solution_1758 {
    public int minOperations(String s) {
        int start0 = 0, start1 = 0;

        for(int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) != i%2) {
                start0++;
            } else {
                start1++;
            }
        }

        return Math.min(start0, start1);
    }
}
