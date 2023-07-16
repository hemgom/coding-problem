package leetcode.difficulty.easy.problem_1528;

public class Solution_1528 {
    public String restoreString(String s, int[] indices) {
        String[] sLetter = s.split("");
        String[] result = new String[indices.length];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = sLetter[i];
        }

        return String.join("", result);
    }
}
