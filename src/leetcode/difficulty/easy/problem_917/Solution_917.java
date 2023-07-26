package leetcode.difficulty.easy.problem_917;

public class Solution_917 {
    public String reverseOnlyLetters(String s) {
        String onlyLetters = s.replaceAll("[^a-zA-Z]", "");
        String[] letters = onlyLetters.split("");
        int letterIndex = letters.length - 1;

        String notLetters = s.replaceAll("[a-zA-Z]", " ");
        String[] specialChars = notLetters.split("");

        for (int i = 0; i < specialChars.length; i++) {
            if (specialChars[i].equals(" ")) {
                specialChars[i] = letters[letterIndex];
                letterIndex--;
            }
        }

        return String.join("", specialChars);
    }
}
