package leetcode.difficulty.easy.problem_2614;

public class Solution_2614 {
    public int diagonalPrime(int[][] nums) {

        int rowA = 0;
        int rowB = nums.length - 1;
        int valueA, valueB;
        int prime = 0;

        for (int i = 0; i < nums.length; i++) {

            valueA = nums[rowA++][i];
            valueB = nums[rowB--][i];

            if (checkPrime(valueA)) prime = Math.max(prime, valueA);
            if (checkPrime(valueB)) prime = Math.max(prime, valueB);
        }

        return prime;
    }

    public boolean checkPrime(int n) {

        if (n == 1) return false;

        for (int j = 2; j <= Math.sqrt(n); j++) {

            if (n % j == 0) return false;
        }

        return true;
    }
}
