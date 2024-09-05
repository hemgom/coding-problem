package leetcode.difficulty.easy.problem_168;

import java.util.LinkedList;

public class Solution_168 {
    public String convertToTitle(int columnNumber) {
        int divideValue = columnNumber;
        LinkedList<Integer> digit = new LinkedList<Integer>();
        StringBuilder result = new StringBuilder();

        if (divideValue <= 26) {
            digit.add(divideValue);
        } else {
            int value = 0;
            int remain = 0;

            while (divideValue > 26) {
                value = divideValue / 26;
                remain = divideValue % 26;

                if (remain == 0) {
                    value--;
                    digit.add(0, 26);
                } else {
                    digit.add(0, remain);
                }

                divideValue = value;
            }

            digit.add(0, value);
        }

        char asciiCodeToChar = ' ';

        for (int num : digit) {
            asciiCodeToChar = (char)(num + 64);
            result.append(String.valueOf(asciiCodeToChar));
        }

        return result.toString();
    }
}
