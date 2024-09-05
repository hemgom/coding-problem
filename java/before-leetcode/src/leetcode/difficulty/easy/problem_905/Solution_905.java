package leetcode.difficulty.easy.problem_905;

public class Solution_905 {
    public int[] sortArrayByParity(int[] nums) {

        int[] reformat = new int[nums.length];

        int evenPointer = 0;
        int oddPointer = reformat.length-1;

        for (int num : nums) {

            if (num % 2 == 0) {
                reformat[evenPointer++] = num;
                continue;
            }

            if (num % 2 == 1) {
                reformat[oddPointer--] = num;
            }
        }

        return reformat;
    }
}
