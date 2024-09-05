package leetcode.difficulty.easy.problem_414;

public class Solution_414 {
    public int thirdMax(int[] nums) {

        long biggest1st = Long.MIN_VALUE;
        long biggest2nd = Long.MIN_VALUE;
        long biggest3rd = Long.MIN_VALUE;

        for (int num : nums) {

            if (biggest1st == num || biggest2nd == num || biggest3rd == num) continue;

            if (biggest1st < num) {
                biggest3rd = biggest2nd;
                biggest2nd = biggest1st;
                biggest1st = (long)num;
            } else if (biggest2nd < num) {
                biggest3rd = biggest2nd;
                biggest2nd = (long)num;
            } else if (biggest3rd < num) {
                biggest3rd = (long)num;
            }
        }

        if (biggest3rd == Long.MIN_VALUE) {
            return (int)biggest1st;
        }

        return (int)biggest3rd;
    }
}
