package leetcode.difficulty.easy.problem_2114;

public class Solution_2114 {
    public int mostWordsFound(String[] sentences) {
        int mostCount = 0;
        int wordsCount = 0;

        for (String sentence : sentences) {
            wordsCount = wordsCount(sentence);

            if (mostCount < wordsCount) {
                mostCount = wordsCount;
            }
        }

        return mostCount;
    }

    public int wordsCount(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        return count + 1;
    }
}
