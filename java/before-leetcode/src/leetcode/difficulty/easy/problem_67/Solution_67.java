package leetcode.difficulty.easy.problem_67;

public class Solution_67 {
    public String addBinary(String a, String b) {
        StringBuilder r = new StringBuilder();
        int pr = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || pr == 1) {
            if (i >= 0) {
                pr += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                pr += b.charAt(j--) - '0';
            }

            r.append(pr % 2);
            pr /= 2;
        }

        return r.reverse().toString();
    }
}
