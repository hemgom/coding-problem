package leetcode.difficulty.easy.problem_2578;

import java.util.Arrays;

public class Solution_2578 {
    public int splitNum(int num) {
        int[] positionValue = makeSortArray(num);
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();

        for (int i = 0; i < positionValue.length; i++) {
            if (i % 2 == 1) {
                sum1.append(positionValue[i]);
            } else {
                sum2.append(positionValue[i]);
            }
        }

        return Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());
    }

    public int[] makeSortArray(int num) {
        String nums = Integer.toString(num);
        int[] positionValue = new int[nums.length()];

        for (int i = 0; i < nums.length(); i++) {
            positionValue[i] = num % 10;
            num = num / 10;
        }

        Arrays.sort(positionValue);

        return positionValue;
    }
}
