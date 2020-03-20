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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            ListNode cur1 = l1;
            ListNode cur2 = l2;
            boolean done = false;
            while (!done) {
                if (l1.val > l2.val) {
                    

                } else {

                }
            }
        } else if (l1 == null && l2 != null) {
            return l2;
        }
        return l1;
    }
}
