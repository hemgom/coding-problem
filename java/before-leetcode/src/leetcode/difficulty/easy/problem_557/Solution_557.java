package leetcode.difficulty.easy.problem_557;

public class Solution_557 {
    public String reverseWords(String s) {

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {

            words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    public String reverse(String word) {

        StringBuilder reWord = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {

            reWord.append(word.charAt(i));
        }

        return reWord.toString();
    }
}
