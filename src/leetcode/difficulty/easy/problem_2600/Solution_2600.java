package leetcode.difficulty.easy.problem_2600;

public class Solution_2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int[] sumArray = new int[numOnes + numZeros + numNegOnes];
        int oneStart = 0;
        int negOneStart = numOnes + numZeros;

        sumArray = kItemsWithMaximumSum(sumArray, oneStart, numOnes, 1);
        sumArray = kItemsWithMaximumSum(sumArray, negOneStart, sumArray.length, -1);

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = result + sumArray[i];
        }

        return result;
    }

    public int[] kItemsWithMaximumSum(int[] sumArray, int startPoint, int count, int val) {
        for (int i = startPoint; i < count; i++) {
            sumArray[i] = val;
        }

        return sumArray;
    }
}
