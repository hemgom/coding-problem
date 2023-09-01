package leetcode.difficulty.easy.problem_693;

public class Solution_693 {
    public boolean hasAlternatingBits(int n) {

        if (n == 1) return true;

        String binary = Integer.toBinaryString(n);

        char before = binary.charAt(0);
        for (int i = 1; i < binary.length(); i++) {

            if (before == binary.charAt(i)) return false;

            before = binary.charAt(i);;
        }

        return true;
    }
}
