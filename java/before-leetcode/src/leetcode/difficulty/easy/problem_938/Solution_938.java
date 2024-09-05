package leetcode.difficulty.easy.problem_938;

public class Solution_938 {
    int value = 0;

    public int rangeSumBST(TreeNode_938 root, int low, int high) {

        if (root == null) return -1;

        int val = root.val;

        if (val >= low && val <= high) value += val;

        if (val > low) rangeSumBST(root.left, low, high);
        if (val < high) rangeSumBST(root.right, low, high);

        return value;
    }
}
