package leetcode.difficulty.easy.problem_387;

public class Solution_387 {
    public int firstUniqChar(String s) {
        int result = -1;

        int firstIndex, lastIndex;
        int minIndex = s.length();

        for (char sLetter = 'a'; sLetter <= 'z'; sLetter++) {
            firstIndex = s.indexOf(sLetter);
            lastIndex = s.lastIndexOf(sLetter);

            if (firstIndex == lastIndex && firstIndex >= 0) {
                minIndex = checkMinIndex(minIndex, firstIndex);
            }
        }

        if (minIndex != s.length()) {
            result = minIndex;
        }

        return result;
    }

    public int checkMinIndex(int minIndex, int firstIndex) {
        if (minIndex > firstIndex) {
            minIndex = firstIndex;
        }

        return minIndex;
    }
}
