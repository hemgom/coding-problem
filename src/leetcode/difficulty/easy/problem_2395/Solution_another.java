package leetcode.difficulty.easy.problem_2395;

import java.util.HashSet;
import java.util.Set;


// 해당 코드는 본 문제를 잘못 이해해서 `subArrays.length = 2`인 경우뿐만 아니라 가능한 모든 길이에 대해 해답을 냄
// `subArrays`의 길이는 `2 <= length <= nums.lengt-1`의 범위를 가진다.
public class Solution_another {
    public boolean findSubarrays(int[] nums) {
        int subMinLength = 2;
        int subMaxLength = nums.length - 1;
        int checkResult = 0;

        for (int i = subMinLength; i <= subMaxLength; i++) {
            checkResult = checkSubarrays(nums, i);

            if (checkResult == 1) {
                break;
            }
        }

        return checkResult == 1;
    }

    public int checkSubarrays(int[] nums, int i) {
        int result = 0;
        Set<Integer> elementSum = new HashSet<>();

        for (int j = 0; j <= nums.length - i; j++) {
            if (!elementSum.add(sumSubarrays(nums, i, j))) {
                result = 1;
                break;
            }
        }

        return result;
    }

    public int sumSubarrays(int[] nums, int i, int j) {
        int elementSum = 0;

        while (i != 0) {
            elementSum += nums[j];
            j++;
            i--;
        }

        return elementSum;
    }
}
