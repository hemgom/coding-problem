package leetcode.difficulty.easy.problem_2485;

public class Solution_2485 {
    public int pivotInteger(int n) {

        int oneToPivot = sumAToB(1, 1);
        int pivotToN = sumAToB(1, n);

        if (oneToPivot == pivotToN) return 1;

        for (int i = 2; i <= n; i++) {

            oneToPivot += i;
            pivotToN -= (i-1);

            if (oneToPivot == pivotToN) return i;
        }

        return -1;
    }

    public int sumAToB(int a, int b) {

        int sum = 0;
        int num = a;

        while (num <= b) {

            sum += num;
            num++;
        }

        return sum;
    }
}
