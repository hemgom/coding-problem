package leetcode.difficulty.easy.problem_2231;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_2231 {
    public int largestInteger(int num) {

        String n = Integer.toString(num);
        Integer[] nums = new Integer[n.length()];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = Character.getNumericValue(n.charAt(i));
        }

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        Arrays.sort(nums, Collections.reverseOrder());

        for (Integer digit : nums) {

            if (digit % 2 == 0) {

                even.add(digit);
                continue;
            }

            odd.add(digit);
        }

        int result = 0;
        int ten = 1;
        int evenIndex = even.size() - 1;
        int oddIndex = odd.size() - 1;

        for (int j = n.length() - 1; j >= 0; j--) {

            int nChar = Character.getNumericValue(n.charAt(j));

            if (nChar % 2 == 0) {
                result += (even.get(evenIndex) * ten);
                evenIndex--;
            } else {
                result += (odd.get(oddIndex) * ten);
                oddIndex--;
            }

            ten *= 10;
        }

        return result;
    }
}
