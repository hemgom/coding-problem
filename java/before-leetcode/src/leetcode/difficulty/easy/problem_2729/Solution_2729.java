package leetcode.difficulty.easy.problem_2729;

public class Solution_2729 {
    public boolean isFascinating(int n) {

        String[] digits = {"1","2","3","4","5","6","7","8","9"};
        StringBuilder connectNum = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            connectNum.append(n * i);
        }

        if (connectNum.indexOf("0") != -1) {
            return false;
        }

        for (String digit : digits) {

            if (connectNum.indexOf(digit) != connectNum.lastIndexOf(digit)) {
                return false;
            }
        }

        return true;
    }
}
