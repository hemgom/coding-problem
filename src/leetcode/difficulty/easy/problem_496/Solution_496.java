package leetcode.difficulty.easy.problem_496;

public class Solution_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int sameElementIndex = 0;
        int i = 0;

        for (int num1 : nums1) {
            sameElementIndex = findSameElement(num1, nums2);
            ans[i] = findNextBigger(sameElementIndex, nums2);
            i++;
        }

        return ans;
    }

    public int findSameElement(int num1, int[] nums2) {
        int i = 0;

        while (num1 != nums2[i]) {
            i++;
        }

        return i;
    }

    public int findNextBigger(int index, int[] nums2) {
        int nextBigger = -1;

        for (int i = index+1; i < nums2.length; i++) {
            if (nums2[index] < nums2[i]) {
                nextBigger = nums2[i];
                break;
            }
        }

        return nextBigger;
    }
}
