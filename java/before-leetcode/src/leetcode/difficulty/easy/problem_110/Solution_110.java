package leetcode.difficulty.easy.problem_110;

public class Solution_110 {
    public boolean isBalanced(TestNode root) {

        if (root == null) return true;

        return heightOfNode(root) != -1;
    }

    public int heightOfNode(TestNode node) {

        if (node == null) return 0;

        int leftHeight = heightOfNode(node.left);
        int rightHeight = heightOfNode(node.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

