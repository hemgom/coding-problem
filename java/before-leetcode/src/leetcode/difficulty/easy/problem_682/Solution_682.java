package leetcode.difficulty.easy.problem_682;

import java.util.ArrayList;
import java.util.List;

public class Solution_682 {
    public int calPoints(String[] operations) {

        List<Integer> record = new ArrayList<>();
        int lastIndex;

        for (String operation : operations) {
            lastIndex = record.size() - 1;

            if (operation.equals("+")) {

                record.add(record.get(lastIndex) + record.get(lastIndex-1));
                continue;
            }

            if (operation.equals("D")) {

                record.add(record.get(lastIndex) * 2);
                continue;
            }

            if (operation.equals("C")) {

                record.remove(lastIndex);
                continue;
            }

            record.add(Integer.parseInt(operation));
        }

        int totalScore = 0;
        for (int r : record) {

            totalScore += r;
        }

        return totalScore;
    }
}
