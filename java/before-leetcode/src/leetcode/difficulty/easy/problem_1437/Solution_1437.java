package leetcode.difficulty.easy.problem_1437;

public class Solution_1437 {
    public boolean kLengthApart(int[] nums, int k) {

        int distance = 0;
        int check = 0;

        for (int num : nums) {

            if (num == 1) {
                check++;
            } else {
                distance++;
            }

            if (check == 2) {

                if (distance < k) return false;

                check = 1;
                distance = 0;
            }
        }

        return true;
    }
}
