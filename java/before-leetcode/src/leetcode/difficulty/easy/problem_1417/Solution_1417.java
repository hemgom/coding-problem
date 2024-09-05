package leetcode.difficulty.easy.problem_1417;

import java.util.ArrayList;
import java.util.List;

public class Solution_1417 {
    public String reformat(String s) {

        String[] sLetter = s.split("");
        String digits = "0123456789";
        List<String> onlyDigit = new ArrayList<>();
        List<String> onlyEnglish = new ArrayList<>();

        for (String letter : sLetter) {

            if (!digits.contains(letter)) {
                onlyEnglish.add(letter);
                continue;
            }

            onlyDigit.add(letter);
        }

        int ds = onlyDigit.size();
        int es = onlyEnglish.size();

        if (Math.abs(ds - es) > 1) return "";

        if (ds >= es) {
            return reformat(onlyDigit, onlyEnglish, s.length());
        }

        return reformat(onlyEnglish, onlyDigit, s.length());
    }

    public String reformat(List<String> list1, List<String> list2, int totalLength) {

        String[] re = new String[totalLength];

        int index1 = 0;
        for (int i = 0; i < totalLength; i+=2) {
            re[i] = list1.get(index1);
            index1++;
        }

        int index2 = 0;
        for (int j = 1; j < totalLength; j+=2) {
            re[j] = list2.get(index2);
            index2++;
        }

        return String.join("", re);
    }
}
