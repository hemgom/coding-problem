package leetcode.difficulty.easy.problem_1796;

import java.util.Arrays;

public class Solution_1796 {
    public int secondHighest(String s) {
        char[] strNums = s.replaceAll("[^0-9]", "").toCharArray();
        int[] intNums = new int[strNums.length];
        int secondNum = -1;

        for (int i = 0; i < strNums.length; i++) {
            intNums[i] = Character.getNumericValue(strNums[i]);
        }

        Arrays.sort(intNums);

        for (int j = intNums.length-2; j >= 0; j--) {
            if (intNums[intNums.length-1] > intNums[j]) {
                secondNum = intNums[j];
                break;
            }
        }

        return secondNum;
    }
}
