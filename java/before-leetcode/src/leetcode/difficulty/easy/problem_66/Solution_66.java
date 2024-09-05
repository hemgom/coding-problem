package leetcode.difficulty.easy.problem_66;

public class Solution_66 {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] != 9) {
            digits[digits.length-1] += 1;
        } else if (digits[digits.length-1] == 9) {
            digits[digits.length-1] = 10;
            for (int i = digits.length-2; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i] += 1;
                    break;
                } else if (digits[i] == 9) {
                    digits[i] = 10;
                }
            }
        }

        for (int j = 0; j < digits.length; j++) {
            digits[j] = digits[j] == 10 ? 0 : digits[j];
        }

        if (digits[0] == 0) {
            int a = digits.length+1;
            int[] result = new int[a];
            result[0] = 1;

            for (int k = 0; k < digits.length; k++) {
                result[k+1] = digits[k];
            }

            return result;
        } else {
            return digits;
        }
    }
}
