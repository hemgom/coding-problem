package leetcode.difficulty.easy.problem_461;

public class Solution_461_01 {
    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);

        int binaryLength;
        if (binaryX.length() > binaryY.length()) {
            binaryLength = binaryX.length();
            binaryY = settingBinary(binaryY, binaryX.length() - binaryY.length());
        } else if (binaryX.length() < binaryY.length()) {
            binaryLength = binaryY.length();
            binaryX = settingBinary(binaryX, binaryY.length() - binaryX.length());
        } else {
            binaryLength = binaryX.length();
        }

        int hammingDistance = 0;

        for (int i = 0; i < binaryLength; i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }

    public String settingBinary(String binary, int subLength) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < subLength; j++) {
            sb.append('0');
        }

        for (int i = 0; i < binary.length(); i++) {
            sb.append(binary.charAt(i));
        }

        return sb.toString();
    }
}
