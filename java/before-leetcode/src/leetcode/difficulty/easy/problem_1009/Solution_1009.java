package leetcode.difficulty.easy.problem_1009;

public class Solution_1009 {
    public int bitwiseComplement(int n) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder bc = new StringBuilder();

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                bc.append("1");
            } else {
                bc.append("0");
            }
        }

        String binaryComplement = bc.toString();

        return Integer.parseInt(binaryComplement, 2);
    }
}
