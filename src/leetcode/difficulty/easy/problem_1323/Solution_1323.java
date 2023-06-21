package leetcode.difficulty.easy.problem_1323;

public class Solution_1323 {
    public int maximum69Number (int num) {
        int numLength = (int)(Math.log10(num)+1);
        int[] nums = new int[numLength];
        int value = num;

        for (int i = numLength-1; i >= 0; i--) {
            nums[i] = value % 10;
            value = value / 10;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 6) {
                nums[j] = 9;
                break;
            }
        }

        int result = 0;

        for (int number : nums) {
            result = result * 10 + number;
        }

        return result;
    }
}
