package leetcode.difficulty.easy.problem_1832;

import java.util.HashSet;
import java.util.Set;

public class Solution_1832 {
    public boolean checkIfPangram(String sentence) {

        Set<Character> alphabet = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {

            alphabet.add(sentence.charAt(i));
        }

        return (alphabet.size() == 26);
    }
}
