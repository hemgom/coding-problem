package leetcode.difficulty.easy.problem_2595;

public class Solution_2595 {
    public int[] evenOddBit(int n) {

        int pointer = 0;
        int even = 0;
        int odd = 0;

        while (n != 0) {
            int bit = n % 2;

            if (bit == 1 && pointer == 0) {
                even++;
            }

            if (bit == 1 && pointer == 1) {
                odd++;
            }

            pointer = Math.abs(pointer - 1);
            n /= 2;
        }

        return new int[]{even, odd};
    }
}
