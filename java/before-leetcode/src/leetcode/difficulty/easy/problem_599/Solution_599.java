package leetcode.difficulty.easy.problem_599;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_599 {
    List<String> result = new ArrayList<>();
    int minIndexSum = Integer.MAX_VALUE;

    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> listTwo = Arrays.asList(list2);

        int l1Index = 0;
        for (String l1 : list1) {

            int l2Index = listTwo.indexOf(l1);

            if (l2Index == -1) {

                l1Index++;
                continue;
            }

            commonIndexSum(l1Index++, l2Index, l1);
        }

        return result.toArray(new String[result.size()]);
    }

    public void commonIndexSum(int list1Index, int list2Index, String s) {

        int indexSum = list1Index + list2Index;
        if (minIndexSum > indexSum) {
            result.clear();
            result.add(s);
            minIndexSum = indexSum;
        } else if (minIndexSum == indexSum) {
            result.add(s);
        }
    }
}
