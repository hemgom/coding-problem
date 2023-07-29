package leetcode.difficulty.easy.problem_2710;

public class Solution_2710 {
    public String removeTrailingZeros(String num) {
        int startZero = -1;
        char[] digits = num.toCharArray();

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == '0' && digits[i-1] != '0') {
                startZero = i;
            } else if (digits[i] != '0') {
                startZero = -1;
            }
        }

        if (startZero == -1) {
            return num;
        }

        return num.substring(0, startZero);
    }
}
