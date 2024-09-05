package leetcode.difficulty.easy.problem_1763;

import java.util.HashSet;
import java.util.Set;

public class Solution_1763 {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) {
            return "";
        }

        char[] letters = s.toCharArray();
        Set<Character> alphabet = new HashSet<>();
        for (char letter : letters) {
            alphabet.add(letter);
        }

        char l;
        for (int i = 0; i < letters.length; i++) {
            l = letters[i];
            if(alphabet.contains(Character.toUpperCase(l)) && alphabet.contains(Character.toLowerCase(l))) continue;
            String substring1 = longestNiceSubstring(s.substring(0, i));
            String substring2 = longestNiceSubstring(s.substring(i + 1));
            return substring1.length() >= substring2.length() ? substring1 : substring2;
        }

        return s;
    }
}
