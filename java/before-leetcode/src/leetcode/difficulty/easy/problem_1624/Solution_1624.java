package leetcode.difficulty.easy.problem_1624;

public class Solution_1624 {
    public int maxLengthBetweenEqualCharacters(String s) {

        int maxLength = -1;
        int length = 0;
        int lastIndex;

        for (int i = 0; i < s.length() - 1; i++) {

            lastIndex = findLastIndex(s, i);

            if (lastIndex == -1) continue;

            length = (lastIndex - i) - 1;
            if (maxLength < length) maxLength = length;
        }

        return maxLength;
    }

    public int findLastIndex(String s, int i) {

        char letter = s.charAt(i);

        for (int index = s.length()-1; index >= i+1; index--) {

            if (letter == s.charAt(index)) return index;
        }

        return -1;
    }
}
