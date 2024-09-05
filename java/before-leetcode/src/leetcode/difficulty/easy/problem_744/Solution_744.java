package leetcode.difficulty.easy.problem_744;

public class Solution_744 {
    public char nextGreatestLetter(char[] letters, char target) {

        int minASCII = 123;

        for (char letter : letters) {

            if (target >= letter) continue;

            if (minASCII > letter) {
                minASCII = letter;
            }
        }

        if (minASCII == 123) return letters[0];

        return (char)minASCII;
    }
}
