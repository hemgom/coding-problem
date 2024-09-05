package leetcode.difficulty.easy.problem_1805;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_1805 {
    public int numDifferentIntegers(String word) {

        List<Character> digits = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        StringBuilder reWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if (digits.contains(letter)) {

                reWord.append(letter);
            } else {

                reWord.append(" ");
            }
        }

        String[] nums = reWord.toString().split(" ");
        Set<String> num = new HashSet<>();

        for (String n : nums) {

            if (n.equals("")) continue;

            char checkZero = n.charAt(0);

            if (checkZero == '0') {

                num.add(removeZero(n));
                continue;
            }

            num.add(n);
        }

        return num.size();
    }

    public String removeZero(String num) {

        StringBuilder removeZero = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char n = num.charAt(i);

            if (n == '0') continue;

            removeZero.append(num.substring(i));
            break;
        }

        return removeZero.toString();
    }
}
