package leetcode.difficulty.easy.problem_1869;

public class Solution_1869 {
    public boolean checkZeroOnes(String s) {

        int count = 0;
        int maxZero = 0;
        int maxOne = 0;
        char prev = ' ';

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (prev != c) {

                prev = c;

                if (maxZero < count && c == '1') maxZero = count;
                if (maxOne < count && c == '0') maxOne = count;

                count = 1;
                continue;
            }

            count++;
        }

        if (prev == '0' && maxZero < count) maxZero = count;
        if (prev == '1' && maxOne < count) maxOne = count;

        return maxZero < maxOne;
    }
}
