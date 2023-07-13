package leetcode.difficulty.easy.problem_2273;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> anagramWord = new ArrayList<>();

        anagramWord.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!makeAnagram(words[i]).equals(makeAnagram(words[i-1]))) {
                anagramWord.add(words[i]);
            }
        }

        return anagramWord;
    }

    public String makeAnagram(String word) {
        String[] charOfWord = word.split("");
        Arrays.sort(charOfWord);

        return String.join("", charOfWord);
    }
}
