package leetcode.difficulty.easy.problem_1576;

public class Solution_1576 {
    public String modifyString(String s) {
        char[] letters = s.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != '?') continue;
            letters[i] = changeChar(letters, i);
        }

        return String.valueOf(letters);
    }

    public char changeChar(char[] letters, int index) {
        char front = '0';
        char back = '0';

        if (index == 0) {
            if (letters.length > 1) {
                back = letters[index+1];
            }
        } else if (index == letters.length-1) {
            front = letters[index-1];
        } else {
            front = letters[index-1];
            back = letters[index+1];
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch != front && ch != back) {
                letters[index] = ch;
                break;
            }
        }

        return letters[index];
    }
}
