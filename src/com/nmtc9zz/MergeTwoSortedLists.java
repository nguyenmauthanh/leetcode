package com.nmtc9zz;

import java.util.logging.Logger;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        // l1 [1,2,4]
        // l2 [1,3,5]
        ListNode initListNode = new ListNode();
        ListNode cur = initListNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;
        return initListNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
}
