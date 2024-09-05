package leetcode.difficulty.easy.problem_1071;

public class Solution_1071 {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1+str2).equals(str2+str1)) return "";

        int length1 = str1.length();
        int length2 = str2.length();
        int xLength = 1;
        int minLength = Math.min(length1, length2);

        for (int i = minLength; i >= 1; i--) {

            if (length1 % i == 0 && length2 % i == 0) {

                xLength = i;
                break;
            }
        }

        return str1.substring(0, xLength);
    }
}
