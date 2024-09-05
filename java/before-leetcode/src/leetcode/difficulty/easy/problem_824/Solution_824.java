package leetcode.difficulty.easy.problem_824;

public class Solution_824 {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        String[] glWords = new String[words.length];
        StringBuilder goatLatin = new StringBuilder();
        int countA = 1;
        int th = 0;
        char firstLetter;

        for (String word : words) {

            firstLetter = word.charAt(0);

            if (checkVowel(firstLetter)) {
                glWords[th] = vowelToGoatLatin(word, goatLatin, countA);
            } else {
                glWords[th] = notVowelToGoatLatin(word, goatLatin, countA);
            }

            countA++;
            th++;
            goatLatin.setLength(0);
        }

        return String.join(" ", glWords);
    }

    public boolean checkVowel(char firstLetter) {

        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};

        for (char vowel : vowels) {

            if (firstLetter == vowel) {
                return true;
            }
        }

        return false;
    }

    public String vowelToGoatLatin(String word, StringBuilder goatLatin, int countA) {

        goatLatin.append(word);
        goatLatin.append("ma");

        goatLatin.append("a".repeat(countA));

        return goatLatin.toString();
    }

    public String notVowelToGoatLatin(String word, StringBuilder goatLatin, int countA) {

        for (int i = 1; i < word.length(); i++) {
            goatLatin.append(word.charAt(i));
        }

        goatLatin.append(word.charAt(0));
        goatLatin.append("ma");

        goatLatin.append("a".repeat(countA));

        return goatLatin.toString();
    }
}
