package leetcode.difficulty.easy.problem_1332;

public class Solution_1332 {
    public int removePalindromeSub(String s) {

        int fI = 0;
        int bI = s.length() - 1;
        while (fI != s.length() / 2) {

            char front = s.charAt(fI);
            char back = s.charAt(bI);

            if (front != back) return 2;

            fI++;
            bI--;
        }

        return 1;
    }
}
