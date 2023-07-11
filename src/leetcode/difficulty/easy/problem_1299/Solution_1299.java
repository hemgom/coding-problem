package leetcode.difficulty.easy.problem_1299;

public class Solution_1299 {
    public int[] replaceElements(int[] arr) {

        if (arr.length > 1) {
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = findRightMaxNum(arr, i);
            }
        }

        arr[arr.length-1] = -1;

        return arr;
    }

    public int findRightMaxNum(int[] arr, int index) {
        int maxNum = 1;

        for (int i = index+1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }
}
