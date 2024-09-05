package leetcode.difficulty.easy.problem_290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_290 {
    public boolean wordPattern(String pattern, String s) {

        String[] value = s.split(" ");
        if (value.length != pattern.length()) return false;

        Map<Character, String> patterns = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char type = pattern.charAt(i);
            if (!patterns.containsKey(type)) {

                patterns.put(type, value[i]);
                continue;
            }

            if (!patterns.get(type).equals(value[i])) return false;
        }

        Set<String> checkValue = new HashSet<>();

        for (char k : patterns.keySet()) {

            if (checkValue.add(patterns.get(k))) continue;

            return false;
        }

        return true;
    }
}
