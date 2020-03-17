package com.sosky;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Solution206 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        System.out.println(reverseList(l1).val);
    }

    public static ListNode reverseList(ListNode head) {
        if (head != null) {

            ListNode last = new ListNode(head.val);
            ListNode curr = head;
            while (curr.next != null) {
                ListNode xx = new ListNode(curr.next.val);
                xx.next = last;
                curr = curr.next;
                last = xx;
            }
            return last;
        } else {
            return null;
        }
    }
}
