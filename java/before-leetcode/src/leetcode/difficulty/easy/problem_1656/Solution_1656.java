package leetcode.difficulty.easy.problem_1656;

import java.util.ArrayList;
import java.util.List;

public class Solution_1656 {
    String[] arr;
    int ptr = 1;

    public Solution_1656(int n) {
        arr = new String[n+1];
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        arr[idKey] = value;

        if (ptr != idKey) return result;

        for (int i = ptr; i < arr.length && arr[i] != null; i++) {
            result.add(arr[i]);
            ptr++;
        }

        return result;
    }
}
