package leetcode.difficulty.easy.problem_2744;

import java.util.Arrays;
import java.util.List;

public class Solution_2744 {
    public int maximumNumberOfStringPairs(String[] words) {

        List<String> onePair = Arrays.asList(words);
        int result = 0;

        for (int i = 0; i < onePair.size(); i++) {

            String word = onePair.get(i);
            if (word.equals("")) continue;

            String rWord = makeReverse(word);
            int rwIndex = onePair.indexOf(rWord);
            if (rwIndex == -1 || rwIndex == i) continue;

            result++;
            onePair.set(i, "");
            onePair.set(rwIndex, "");
        }

        return result;
    }

    public String makeReverse(String word) {

        StringBuilder rWord = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {

            rWord.append(word.charAt(i));
        }

        return rWord.toString();
    }
}
