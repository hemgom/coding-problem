package leetcode.difficulty.easy.problem_2586;

public class Solution_2586 {
    public int vowelStrings(String[] words, int left, int right) {

        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = left; i <= right; i++) {

            String word = words[i];
            char f = word.charAt(0);
            char e = word.charAt(word.length()-1);

            if (checkVowel(vowel, f) && checkVowel(vowel, e)) count++;
        }

        return count;
    }

    public boolean checkVowel(char[] vowel, char c) {

        for (char letter : vowel) {

            if (letter == c) return true;
        }

        return false;
    }
}
