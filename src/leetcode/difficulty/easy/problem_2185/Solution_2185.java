package leetcode.difficulty.easy.problem_2185;

public class Solution_2185 {
    public int prefixCount(String[] words, String pref) {
        int prefSize = pref.length();
        int collectCount = 0;

        for (String word : words) {
            switch (prefixCount(word.length(), prefSize)) {
                case 0 : collectCount += word.substring(0, prefSize).equals(pref) ? 1 : 0 ;
                    break;
                case 1 : collectCount += word.equals(pref) ? 1 : 0 ;
                    break;
                case 2 : collectCount += 0;
                    break;
            }
        }

        return collectCount;
    }

    public int prefixCount(int wordSize, int prefSize) {
        int valueSame = 0;

        if (wordSize == prefSize) {
            valueSame = 1;
        } else if (wordSize < prefSize) {
            valueSame = 2;
        }

        return valueSame;
    }
}
