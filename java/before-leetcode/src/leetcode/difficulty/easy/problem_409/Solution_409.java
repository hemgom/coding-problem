package leetcode.difficulty.easy.problem_409;

import java.util.HashSet;
import java.util.Set;

public class Solution_409 {
    public int longestPalindrome(String s) {

        Set<Character> letter = new HashSet<>();
        int pL = 0;

        for (int i = 0; i < s.length(); i++) {

            char l = s.charAt(i);
            if (letter.contains(l)) {

                pL += 2;
                letter.remove(l);
                continue;

            }

            letter.add(l);
        }

        if (letter.size() > 0) return pL + 1;

        return pL;
    }
}
