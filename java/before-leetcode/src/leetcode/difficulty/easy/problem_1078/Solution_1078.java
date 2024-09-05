package leetcode.difficulty.easy.problem_1078;

import java.util.ArrayList;
import java.util.List;

public class Solution_1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> thirdWords = new ArrayList<>();
        String[] words = text.split(" ");

        for (int i = 0; i < words.length-2; i++) {
            if (words[i].equals(first) && words[i+1].equals(second)) {
                thirdWords.add(words[i+2]);
            }
        }

        return thirdWords.toArray(new String[thirdWords.size()]);
    }
}
