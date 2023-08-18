package leetcode.difficulty.easy.problem_1413;

public class Solution_1413 {
    public int minStartValue(int[] nums) {

        int startValue = 1;

        while (!stepByStepSum(nums, startValue)) {

            startValue++;
        }

        return startValue;
    }

    public boolean stepByStepSum(int[] nums, int startValue) {

        for (int num : nums) {

            startValue += num;

            if (startValue < 1) return false;
        }

        return true;
    }
}
