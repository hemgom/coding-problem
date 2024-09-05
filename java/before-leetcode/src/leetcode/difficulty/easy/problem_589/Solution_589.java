package leetcode.difficulty.easy.problem_589;

import java.util.ArrayList;
import java.util.List;

public class Solution_589 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {

        if (root == null) return result;

        addVal(root);

        return result;
    }

    public void addVal(Node root) {

        result.add(root.val);

        for (Node child : root.children) {

            addVal(child);
        }
    }
}
