package leetcode.difficulty.easy.problem_1592;

public class Solution_1592 {
    public String reorderSpaces(String text) {
        int tl = text.length();
        char tch = ' ';
        int spaceValue = 0;
        int wordCount = 0;
        int wordValue = 0;

        for (int n = 0; n < tl; n++) {
            if (n+1 == tl || text.charAt(n+1) == ' ') {
                wordValue += 1;
            }
        }

        int[][] subString = new int[wordValue][2];

        for (int i = 0; i < tl; i++) {
            tch = text.charAt(i);
            if (tch == ' ') {
                spaceValue += 1;
            } else {
                if (i == 0 || text.charAt(i-1) == ' ') {
                    subString[wordCount][0] = i;
                    if (i == tl-1 || text.charAt(i+1) == ' ') {
                        subString[wordCount][1] = i+1;
                        wordCount += 1;
                    }
                } else if (i == tl-1 || text.charAt(i+1) == ' ') {
                    subString[wordCount][1] = i+1;
                    wordCount += 1;
                }
            }
        }

        String result = "";
        int blankCount = 0;
        int remainBlank = 0;

        if (wordCount > 1) {
            blankCount = spaceValue / (wordCount - 1);
            remainBlank = spaceValue % (wordCount -1);
        } else if (wordCount == 1) {
            remainBlank = spaceValue;
        }

        for (int j = 0; j < wordCount; j++) {
            if (j < wordCount-1) {
                result += text.substring(subString[j][0], subString[j][1]);
                for (int k = 1; k <= blankCount; k++) {
                    result += " ";
                }
            } else if (j == wordCount-1) {
                result += text.substring(subString[j][0], subString[j][1]);
                for (int k = 1; k <= remainBlank; k++) {
                    result += " ";
                }
            }
        }

        return result;
    }
}
