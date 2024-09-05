package leetcode.difficulty.easy.problem_108;

public class Solution_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums, int startIndex, int endIndex) {
        if ( startIndex > endIndex) {
            return null;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        TreeNode rootNode = new TreeNode(nums[middleIndex]);

        rootNode.left = sortedArrayToBST(nums, startIndex, middleIndex-1);
        rootNode.right = sortedArrayToBST(nums, middleIndex+1, endIndex);

        return rootNode;
    }
}

// 알고리즘 문제 제공 클래스 'TreeNode'
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
