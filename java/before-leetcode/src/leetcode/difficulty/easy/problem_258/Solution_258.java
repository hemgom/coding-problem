package leetcode.difficulty.easy.problem_258;

public class Solution_258 {
    public int addDigits(int num) {
        int result = addResult(num);

        while (Integer.toString(result).length() > 1) {
            result = addResult(result);
        }

        return result;
    }

    public int addResult(int num) {
        int addResult = 0;

        while (num != 0) {
            addResult += num % 10;
            num = num / 10;
        }

        return addResult;
    }
}
