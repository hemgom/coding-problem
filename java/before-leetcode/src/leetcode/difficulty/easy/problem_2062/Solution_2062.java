package leetcode.difficulty.easy.problem_2062;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_2062 {
    public int countVowelSubstrings(String word) {

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int result = 0;

        for (int j = 0; j < word.length() - 4; j++) {

            result += subStringCount(word, vowels, j);
        }

        return result;
    }

    public int subStringCount(String word, List<Character> vowels, int startIndex) {

        int count = 0;
        Set<Character> vowelCount = new HashSet<>();

        for (int i = startIndex; i < word.length(); i++) {

            if (!vowels.contains(word.charAt(i))) break;

            if (vowelCount.size() < 5) vowelCount.add(word.charAt(i));

            if (vowelCount.size() == 5) {
                count++;
            }
        }

        return count;
    }
}
