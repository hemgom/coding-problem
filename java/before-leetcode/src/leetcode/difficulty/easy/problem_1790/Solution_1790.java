package leetcode.difficulty.easy.problem_1790;

import java.util.Arrays;

public class Solution_1790 {
    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        }

        return checkSwapString(s1, s2);
    }

    public boolean checkSwapString(String s1, String s2) {

        char[] s1Letters = s1.toCharArray();
        char[] s2Letters = s2.toCharArray();
        int[] s2difIndex = new int[2];

        int difCharCount = 0;
        for (int i = 0; i < s1Letters.length; i++) {

            if (s1Letters[i] == s2Letters[i]) continue;

            difCharCount++;
            if (difCharCount > 2) {
                return false;
            }

            s2difIndex[difCharCount-1] = i;
        }

        if (difCharCount == 1) {
            return false;
        }

        char temp = s2Letters[s2difIndex[0]];
        s2Letters[s2difIndex[0]] = s2Letters[s2difIndex[1]];
        s2Letters[s2difIndex[1]] = temp;

        return Arrays.equals(s1Letters, s2Letters);
    }
}
