package leetcode.difficulty.easy.problem_925;

public class Solution_925 {
    public boolean isLongPressedName(String name, String typed) {

        int nL = name.length();
        int tL = typed.length();
        int pN = 0;
        int pT = 0;
        char prev = ' ';

        while (pN < nL && pT < tL) {

            char n = name.charAt(pN);
            char t = typed.charAt(pT);

            if (n == t) {

                prev = n;
                pN++;
                pT++;
                continue;
            }

            if (prev != t) return false;

            pT++;
        }

        for (int j = pN-1; j < nL; j++) {

            if (name.charAt(j) != prev) return false;
        }

        for (int i = pT-1; i < tL; i++) {

            if (typed.charAt(i) != prev) return false;
        }

        return true;
    }
}
