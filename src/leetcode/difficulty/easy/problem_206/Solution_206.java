package leetcode.difficulty.easy.problem_206;

public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode front = head;
        ListNode back = null;

        while (front != null) {
            ListNode tmp = front.next;
            front.next = back;
            back = front;
            front = tmp;
        }

        return back;
    }
}

// 단일 링크 리스트에 대한 정의
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
