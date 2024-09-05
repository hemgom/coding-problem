package leetcode.difficulty.easy.problem_2210;

import java.util.ArrayList;
import java.util.List;

public class Solution_2210 {
    public int countHillValley(int[] nums) {

        List<Integer> unique = new ArrayList<>();

        int n = 0;
        for (int num : nums) {

            if (n == num) continue;

            unique.add(num);
            n = num;
        }

        if (unique.size() < 3) return 0;

        int count = 0;
        int a = unique.get(0);
        int b = unique.get(1);
        int c;
        for (int i = 2; i < unique.size(); i++) {

            c = unique.get(i);

            if (b > a && b > c) {
                count++;
            } else if (b < a && b < c) {
                count++;
            }

            a = b;
            b = c;
        }

        return count;
    }
}
