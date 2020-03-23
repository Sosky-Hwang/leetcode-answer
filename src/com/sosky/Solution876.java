package com.sosky;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * <p>
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Solution876 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        head.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        ListNode l4 = new ListNode(4);
        l3.next = l4;
        ListNode l5 = new ListNode(5);
        l4.next = l5;
        ListNode l6 = new ListNode(6);
        l5.next = l6;
        System.out.println(middleNode(head).val);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode result = head;
        ListNode curr = head;
        int x = 0;
        while (curr.next != null) {
            curr = curr.next;
            x++;
            if (x == 2) {
                result = result.next;
                x = 0;
            } else if (x == 1 && curr.next == null) {
                result = result.next;
            }
        }
        return result;
    }
}
