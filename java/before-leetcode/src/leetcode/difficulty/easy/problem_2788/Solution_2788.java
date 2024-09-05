package leetcode.difficulty.easy.problem_2788;

import java.util.ArrayList;
import java.util.List;

public class Solution_2788 {
    List<String> reWords = new ArrayList<>();

    public List<String> splitWordsBySeparator(List<String> words, char separator) {

        StringBuilder div = new StringBuilder();
        div.append("\\");
        div.append(separator);

        for (String word : words) {

            removeSeparator(word, div.toString());
        }

        return reWords;
    }

    public void removeSeparator (String s, String sep) {

        String[] reWord = s.split(String.valueOf(sep));

        for (String re : reWord) {

            if (!re.equals("")) reWords.add(re);
        }
    }
}
