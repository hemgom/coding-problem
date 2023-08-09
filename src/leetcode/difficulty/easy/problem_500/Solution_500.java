package leetcode.difficulty.easy.problem_500;

import java.util.ArrayList;
import java.util.List;

public class Solution_500 {
    public String[] findWords(String[] words) {

        List<String> result = new ArrayList<>();

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        String lowerWord, firstLetter;
        int checkResult = -1;

        for (String word : words) {

            lowerWord = word.toLowerCase();
            firstLetter = lowerWord.substring(0, 1);

            if (firstRow.contains(firstLetter)) {
                checkResult = checkWord(lowerWord, firstRow);
            }

            if (secondRow.contains(firstLetter)) {
                checkResult = checkWord(lowerWord, secondRow);
            }

            if (thirdRow.contains(firstLetter)) {
                checkResult = checkWord(lowerWord, thirdRow);
            }

            if (checkResult == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public int checkWord(String word, String row) {

        for (int i = 0; i < word.length(); i++) {

            if (row.indexOf(word.charAt(i)) == -1) {
                return 0;
            }
        }

        return 1;
    }
}
