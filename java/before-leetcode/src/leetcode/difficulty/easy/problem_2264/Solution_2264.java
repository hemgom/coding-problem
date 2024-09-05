package leetcode.difficulty.easy.problem_2264;

public class Solution_2264 {
    public String largestGoodInteger(String num) {

        int digit = -1;
        int maxDigit = -1;
        int count = 1;

        for (int i = 0; i < num.length(); i++) {

            int n = Character.getNumericValue(num.charAt(i));

            if (digit == n) {

                count++;

                if (count == 3 && maxDigit < n) maxDigit = n;
                continue;
            }

            digit = n;
            count = 1;
        }

        if (maxDigit > 0) return Integer.toString(111 * maxDigit);

        if (maxDigit == -1) return "";

        return "000";
    }
}
