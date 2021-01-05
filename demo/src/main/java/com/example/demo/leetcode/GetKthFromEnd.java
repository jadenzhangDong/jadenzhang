package com.example.demo.LeetCode;

import org.junit.Test;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null) return null;
        ListNode startNode = head;
        for (int i = 0; i < k-1; i++) {
            head = head.next;
        }
        while(head!=null && head.next!=null){
            head = head.next;
            startNode = startNode.next;
        }
        return startNode;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for (int i = 2; i < 2; i++) {
            listNode.next = new ListNode(i);
            listNode = listNode.next;
        }
        System.out.println(getKthFromEnd(head,1));
    }
}
