package leetcode.difficulty.easy.problem_922;

public class Solution_922 {
    public int[] sortArrayByParityII(int[] nums) {

        int[] result = new int[nums.length];
        int even = 0;
        int odd = 1;

        for (int num : nums) {

            if (num % 2 == 0) {

                result[even] = num;
                even += 2;
            } else {

                result[odd] = num;
                odd += 2;
            }
        }

        return result;
    }
}
