package leetcode.difficulty.easy.problem_242;

import java.util.Arrays;

public class Solution_242 {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        String word1 = String.valueOf(sArray);
        String word2 = String.valueOf(tArray);

        return word1.equals(word2);
    }
}
