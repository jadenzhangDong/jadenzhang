package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.HashSet;

public class DeleteDuplicates {


    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        HashSet<Integer> nums = new HashSet<>();
        ListNode current = head;
        ListNode last = current;
        while(true){

            if(nums.contains(current.val)){
                last.next = current.next;
                current = last.next;
            }else{
                nums.add(current.val);
                last = current;
                current = current.next;
            }
            if(current==null){
                break;
            }

        }
        return head;
    }


@Test
    public void test(){
        deleteDuplicates(createNode());
    }


    private ListNode createNode(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        listNode4.next = listNode5;
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode1.next = listNode2;
        return listNode1;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    //tijie
    public ListNode tijie(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}


