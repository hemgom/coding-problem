package leetcode.difficulty.easy.problem_13;

import java.util.Map;

public class Solution_13 {
    public int romanToInt(String s) {

        Map<Character, Integer> romaInteger =
                Map.of('I', 1,
                        'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000);

        int resultNum = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            int flag = romaInteger.get(s.charAt(i));

            if (num < flag) {
                resultNum += flag - (num * 2);
            }

            if (num >= flag) {
                resultNum += flag;
            }

            num = flag;
        }

        return resultNum;
    }
}
