package leetcode.difficulty.easy.problem_821;

public class Solution_821 {
    public int[] shortestToChar(String s, char c) {

        int sl = s.length();
        int[] answer = new int[sl];

        int distance;
        for (int i = 0; i < sl; i++) {

            int before = s.lastIndexOf(c, i);
            if (before == -1) before = Integer.MAX_VALUE;

            int after = s.indexOf(c, i);
            if (after == -1) after = Integer.MAX_VALUE;

            distance = Math.min(Math.abs(i-before), Math.abs(i-after));
            answer[i] = distance;
        }

        return answer;
    }
}
