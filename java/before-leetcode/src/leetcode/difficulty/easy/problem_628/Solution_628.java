package leetcode.difficulty.easy.problem_628;

import java.util.Arrays;

public class Solution_628 {
    public int maximumProduct(int[] nums) {
        int result = 0;
        int value1, value2;

        Arrays.sort(nums);

        value1 = threePlus(nums);
        value2 = onePlusTwoMinus(nums);

        if (value1 < value2) {
            result = value2;
        } else if (value1 > value2) {
            result = value1;
        } else {
            result = value1;
        }

        return result;
    }

    public int threePlus(int[] nums) {
        int result = 1;
        int index = nums.length-1;
        int count = 0;

        while (count < 3) {
            result *= nums[index];
            index--;
            count++;
        }

        return result;
    }

    public int onePlusTwoMinus(int[] nums) {
        int result = 1;
        int index = 0;
        int count = 0;

        while (count < 2) {
            result *= nums[index];
            index++;
            count++;
        }

        result *= nums[nums.length-1];

        return result;
    }
}
