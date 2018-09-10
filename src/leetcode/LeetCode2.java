package leetcode;


/**
 * 两数相加
 */
public class LeetCode2 {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curNode = head;
        int remainder = 0;
        while (l1 != null || l2 != null || remainder != 0) {
            int value;
            if (l1 != null && l2 != null) {
                value = l1.val + l2.val + remainder;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                value = l1.val + remainder;
                l1 = l1.next;
            } else if (l2 != null) {
                value = l2.val + remainder;
                l2 = l2.next;
            } else {
                value = remainder;
            }
            if (value > 9) {
                remainder = 1;
            } else {
                remainder = 0;
            }
            ListNode node = new ListNode(value % 10);
            curNode.next = node;
            curNode = node;
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
