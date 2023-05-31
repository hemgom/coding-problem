package leetcode.difficulty.easy.problem_2129;

public class Solution_2129 {
    public String capitalizeTitle(String title) {
        int wordStartIndex = 0;
        int emptyIndex = 0;
        String result = "";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ') {
                emptyIndex = i;
                result += capitalizeTitle(title, wordStartIndex, emptyIndex) + " ";
                wordStartIndex = i+1;
            }
        }
        result += capitalizeTitle(title, wordStartIndex);

        return result;
    }

    public String capitalizeTitle(String title, int wordStartIndex, int emptyIndex) {
        String result = "";

        result = title.substring(wordStartIndex, emptyIndex);

        if (result.length() > 2) {
            result = result.toUpperCase();
            result = result.charAt(0) + result.substring(1).toLowerCase();
        } else {
            result = result.toLowerCase();
        }

        return result;
    }

    public String capitalizeTitle(String title, int wordStartIndex) {
        String result = "";

        result = title.substring(wordStartIndex);

        if (result.length() > 2) {
            result = result.toUpperCase();
            result = result.charAt(0) + result.substring(1).toLowerCase();
        } else {
            result = result.toLowerCase();
        }

        return result;
    }
}
