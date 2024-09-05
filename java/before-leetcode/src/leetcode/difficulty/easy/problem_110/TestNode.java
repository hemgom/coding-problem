package leetcode.difficulty.easy.problem_110;

// 문제에서 제공하는 TestNode 클래스이다.
public class TestNode {
    int val;
    TestNode left;
    TestNode right;

    TestNode() {}

    TestNode(int val) {this.val = val;}

    TestNode(int val, TestNode left, TestNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
