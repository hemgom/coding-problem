package leetcode.difficulty.easy.problem_1768;

public class Solution_1768 {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merge = new StringBuilder();
        int one = 0;
        int two = 0;
        int w1L = word1.length();
        int w2L = word2.length();

        while (one < w1L || two < w2L) {

            if (one != w1L) {

                merge.append(word1.charAt(one++));
            }

            if (two != w2L) {

                merge.append(word2.charAt(two++));
            }
        }

        return merge.toString();
    }
}
