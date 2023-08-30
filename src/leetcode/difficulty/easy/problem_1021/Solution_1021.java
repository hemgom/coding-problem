package leetcode.difficulty.easy.problem_1021;

public class Solution_1021 {
    public String removeOuterParentheses(String s) {

        StringBuilder primitive = new StringBuilder();
        int sIndex = 1;
        int eIndex = 0;
        int check = 0;
        String ps;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                check++;
            } else {
                check--;
            }

            if (check == 0) {
                eIndex = i;
                ps = s.substring(sIndex, eIndex);
                primitive.append(ps);
                sIndex = eIndex+2;
            }
        }

        return primitive.toString();
    }
}
