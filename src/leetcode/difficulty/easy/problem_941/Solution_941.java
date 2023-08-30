package leetcode.difficulty.easy.problem_941;

public class Solution_941 {
    public boolean validMountainArray(int[] arr) {

        int al = arr.length;

        if (al < 3) return false;

        int before = arr[0];
        int topIndex = -1;
        int now;
        for (int i = 1; i < al; i++) {

            now = arr[i];

            if (before == now) return false;

            if (before > now) break;

            before = now;
            topIndex = i;
        }

        if (topIndex == al-1) return false;

        for (int j = topIndex+1; j < al; j++) {

            now = arr[j];

            if (before <= arr[j]) return false;

            before = now;
        }

        return true;
    }
}
