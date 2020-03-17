package com.sosky;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Solution160 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode lA1 = new ListNode(1);
        ListNode l8 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode lB0 = new ListNode(0);
        ListNode lB1 = new ListNode(1);
        headA.next = lA1;
        lA1.next = l8;
        l8.next = l4;
        l4.next = l5;
        headB.next = lB0;
        lB0.next = lB1;
        lB1.next = l8;
        System.out.println(getIntersectionNode(headA, headB).val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode result = null;
        if (headA != null && headB != null) {
            ListNode cursor1 = headA;
            while (cursor1 != null) {
                ListNode cursor2 = headB;
                boolean abort = false;
                while (cursor2 != null) {
                    if (cursor1 == cursor2) {
                        result = cursor1;
                        abort = true;
                        break;
                    } else {
                        cursor2 = cursor2.next;
                    }
                }
                if (abort) {
                    break;
                }
                cursor1 = cursor1.next;
            }
        }
        return result;
    }
}
