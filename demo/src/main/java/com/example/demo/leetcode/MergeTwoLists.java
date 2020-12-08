package com.example.demo.leetcode;

import org.junit.Test;

public class MergeTwoLists {



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = l1;
        ListNode tmp = null;
        ListNode current = null;
        while (true) {
            if(l1.val <= l2.val){

            }
            break;
        }

        return returnNode;
    }





    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }




    @Test
    public void test(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        n2.next = n3;
        n1.next = n2;

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);
        m2.next = m3;
        m1.next = m2;

        this.mergeTwoLists(n1, m1);

    }
}
