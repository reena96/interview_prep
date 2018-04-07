package com.company.Leetcode;


//Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedLists {
     ListNode l;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        System.out.println(l1.next.next.val);
        System.out.println(l2.next.next.val);



        return l;
    }

    public static void main(String[] args){
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(4);

        ListNode n2 = new ListNode(4);
        n1.next = new ListNode(3);
        n1.next.next = new ListNode(5);
        m.mergeTwoLists(n1,n2);
    }
}


