package leetcode.difficulty.easy.problem_506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_506 {
    public String[] findRelativeRanks(int[] score) {

        Map<Integer, Integer> scoreMap = new HashMap<>();
        String[] answer = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            scoreMap.put(score[i], i);
        }

        Arrays.sort(score);

        if (score.length > 0) {
            answer[scoreMap.get(score[score.length-1])] = "Gold Medal";
        }

        if (score.length > 1) {
            answer[scoreMap.get(score[score.length-2])] = "Silver Medal";
        } else {
            return answer;
        }

        if (score.length > 2) {
            answer[scoreMap.get(score[score.length-3])] = "Bronze Medal";
        } else {
            return answer;
        }

        if (score.length > 3) {
            int numberRank = 4;
            for (int j = score.length-4; j >= 0; j--) {
                answer[scoreMap.get(score[j])] = String.valueOf(numberRank);
                numberRank++;
            }
        }

        return answer;
    }
}
