package leetcode.difficulty.easy.problem_2047;

import java.util.Arrays;

public class Solution_2047 {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        int tokenCount = 0;

        Arrays.sort(words);

        for (int i = words.length-1; i >= 0; i--) {
            if (words[i].equals("")) {
                break;
            }

            tokenCount += checkContains(words[i]);
        }

        return tokenCount;
    }

    public int checkContains(String word) {
        int checkCount = 0;
        int result = 0;

        String checkLetter = word.replaceAll("[a-z-!,.]", "");
        if (checkLetter.equals("")) {
            checkCount++;
        } else {
            return result;
        }

        int hypensCount = marksCount(word, '-');
        if (hypensCount == 1) {
            if (word.indexOf("-") != 0 && word.indexOf("-") != word.length()-1) {
                checkCount += hypensCheck(word);
            }
        } else if (hypensCount == 0) {
            checkCount++;
        } else {
            return result;
        }

        checkLetter = word.replaceAll("[^!,.]", "");
        if (checkLetter.length() == 1) {
            if (word.indexOf(checkLetter) == word.length()-1) {
                checkCount++;
            }
        } else if (checkLetter.length() == 0) {
            checkCount++;
        } else {
            return result;
        }

        if (checkCount == 3) {
            result = 1;
        }

        return result;
    }

    public int marksCount(String word, char mark) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == mark) {
                count++;
            }
        }

        return count;
    }

    public int hypensCheck(String word) {
        int result = 0;
        int hypensIndex = word.indexOf("-");
        String partOfWord = word.substring(hypensIndex-1, hypensIndex+2);

        partOfWord = partOfWord.replaceAll("[a-z-]", "");

        if (partOfWord.length() == 0) {
            result = 1;
        }

        return result;
    }
}
