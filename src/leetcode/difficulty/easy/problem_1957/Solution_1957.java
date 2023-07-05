package leetcode.difficulty.easy.problem_1957;

public class Solution_1957 {
    public String makeFancyString(String s) {
        StringBuilder fancyString = new StringBuilder();
        int sameCount = 0;

        fancyString.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                sameCount++;
                if (sameCount < 2) {
                    fancyString.append(s.charAt(i));
                }
            } else {
                sameCount = 0;
                fancyString.append(s.charAt(i));
            }
        }

        return fancyString.toString();
    }
}
