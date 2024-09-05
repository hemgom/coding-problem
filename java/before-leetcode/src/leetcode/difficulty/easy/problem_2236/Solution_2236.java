package leetcode.difficulty.easy.problem_2236;

public class Solution_2236 {
    public boolean checkTree(TreeNode root) {

        int sumChildNode = root.left.val + root.right.val;

        if (root.val == sumChildNode) return true;

        return false;
    }
}
