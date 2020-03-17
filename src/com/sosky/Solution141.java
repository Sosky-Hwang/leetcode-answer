package com.sosky;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表，判断链表中是否有环。
 */
public class Solution141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l0 = new ListNode(0);
        ListNode l4 = new ListNode(-4);
        head.next = l2;
        l2.next = l0;
        l0.next = l4;
        l4.next = l2;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        boolean result = false;
        ListNode target = head;
        Set<ListNode> listNodes = new HashSet<>();
        while (target != null) {
            if (listNodes.contains(target)) {
                result = true;
                break;
            } else {
                listNodes.add(target);
                target = target.next;
            }
        }
        return result;
    }
}
