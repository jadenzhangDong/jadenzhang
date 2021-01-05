package com.example.demo.LeetCode;

import org.junit.Test;

public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode smallNode = new ListNode(-1);
        ListNode bigNode = new ListNode(-1);
        ListNode bigHeadNode = bigNode;
        ListNode smallHeadNode = smallNode;
        while(head!=null){
            if(head.val < x){
                smallNode.next = head;
                smallNode = smallNode.next;
            }else{
                bigNode.next = head;
                bigNode = bigNode.next;
            }
            head = head.next;
        }
        bigNode.next = null;
        smallNode.next = bigHeadNode.next;
        return smallHeadNode.next;
    }



    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
   @Test
   public void test(){
        int[] a = {1, 4, 3, 2, 5, 2};
       ListNode tmpNode = null;
       ListNode headNode = null;
       for (int i = 0; i < a.length; i++) {
           if(tmpNode==null){
               tmpNode = new ListNode(a[i]);
               headNode = tmpNode;
               continue;
           }
           tmpNode.next = new ListNode(a[i]);
           tmpNode = tmpNode.next;
       }

       System.out.println(partition(headNode, 3));
   }
}
