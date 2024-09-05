package leetcode.difficulty.easy.problem_944;

import java.util.HashSet;
import java.util.Set;

public class Solution_944 {
    Set<Integer> removeRow = new HashSet<>();

    public int minDeletionSize(String[] strs) {

        char[] letters = strs[0].toCharArray();

        for (int i = 1; i < strs.length; i++) {

            char[] nextLetters = strs[i].toCharArray();
            checkLetter(letters, nextLetters);
        }

        return removeRow.size();
    }

    public void checkLetter(char[] letters, char[] nextLetters) {

        for (int j = 0; j < letters.length; j++) {

            char l = letters[j];
            char nl = nextLetters[j];

            if (l <= nl) {
                letters[j] = nl;
            } else {
                removeRow.add(j);
            }
        }
    }
}
