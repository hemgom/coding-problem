package leetcode.difficulty.easy.problem_1929;

public class Solution_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }

        return ans;
    }
}
