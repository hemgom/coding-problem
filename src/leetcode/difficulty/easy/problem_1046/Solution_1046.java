package leetcode.difficulty.easy.problem_1046;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution_1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> sortStones = new LinkedList<>();

        for (int weight : stones) {
            sortStones.add(weight);
        }

        Collections.sort(sortStones);

        int x, y;

        while (sortStones.size() > 1) {
            y = sortStones.get(sortStones.size()-1);
            x = sortStones.get(sortStones.size()-2);

            sortStones.set(sortStones.size()-2, y - x);
            sortStones.remove(sortStones.size()-1);

            Collections.sort(sortStones);
        }

        int result = 0;

        if (sortStones.size() == 1) {
            result = sortStones.get(0);
        }

        return result;
    }
}
