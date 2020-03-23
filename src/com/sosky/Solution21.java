package com.sosky;

public class Solution21 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode l11 = new ListNode(2);
//        l1.next = l11;
//        ListNode l12 = new ListNode(4);
//        l11.next = l12;
//        ListNode l2 = new ListNode(1);
//        ListNode l21 = new ListNode(3);
//        l2.next = l21;
//        ListNode l22 = new ListNode(4);
//        l21.next = l22;
//        System.out.println(mergeTwoLists(l1, l2));

        ListNode l1 = new ListNode(-9);
        ListNode l11 = new ListNode(3);
        l1.next = l11;
        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(7);
        l2.next = l21;
        System.out.println(mergeTwoLists(l1, l2));
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
