package leetcode.difficulty.easy.problem_14;

import java.util.Arrays;
import java.util.List;

public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {

        List<String> strList = Arrays.asList(strs);
        StringBuilder prefix = new StringBuilder();

        if (strList.contains("")) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            if (!checkPrefix(strList, c, i)) break;

            prefix.append(strs[0].charAt(i));
        }

        return prefix.toString();
    }

    public boolean checkPrefix(List<String> strList, char c, int i) {

        for (String str : strList) {

            if (str.indexOf(c, i) != i) return false;
        }

        return true;
    }
}
