package leetcode.difficulty.easy.problem_2496;

public class Solution_2496 {
    public int maximumValue(String[] strs) {
        String checkOnlyNums = "";
        int maxStrLength = 0;
        int strLength = 0;

        for (String str : strs) {
            checkOnlyNums = str.replaceAll("[0-9]", "");
            strLength = strLength(checkOnlyNums, str);
            if (strLength > maxStrLength) {
                maxStrLength = strLength;
            }
        }

        return maxStrLength;
    }

    public int strLength(String checkOnlyNums, String str) {
        int strLength = 0;

        if (checkOnlyNums.equals("")) {
            strLength = Integer.parseInt(str);
        } else {
            strLength = str.length();
        }

        return strLength;
    }
}
