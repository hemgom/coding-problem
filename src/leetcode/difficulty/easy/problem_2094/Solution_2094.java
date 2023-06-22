package leetcode.difficulty.easy.problem_2094;

import java.util.ArrayList;

public class Solution_2094 {
    ArrayList<Integer> result = new ArrayList<Integer>();

    public int[] findEvenNumbers(int[] digits) {
        int exceptIndex1 = 0;
        int number;

        for (int i = 0; i < digits.length; i++) {
            number = 0;
            if (digits[i] != 0) {
                number = digits[i] * 100;
                exceptIndex1 = i;
                findEvenNumbers(digits, number, exceptIndex1);
            }
        }

        return result.stream().mapToInt(i -> i).distinct().sorted().toArray();
    }

    public void findEvenNumbers(int[] digits, int number, int exceptIndex1) {
        int exceptIndex2 = 0;
        int number2;

        for (int j = 0; j < digits.length; j++) {
            if (j != exceptIndex1) {
                number2 = number + (digits[j] * 10);
                exceptIndex2 = j;
                findEvenNumbers(digits, number2, exceptIndex1, exceptIndex2);
            }
        }
    }

    public void findEvenNumbers(int[] digits, int number, int exceptIndex1, int exceptIndex2) {
        for (int k = 0; k < digits.length; k++) {
            if (k != exceptIndex1 && k != exceptIndex2) {
                findEvenNumbers(number + digits[k]);
            }
        }
    }

    public void findEvenNumbers(int number) {
        if (number % 2 == 0) {
            result.add(number);
        }
    }
}
