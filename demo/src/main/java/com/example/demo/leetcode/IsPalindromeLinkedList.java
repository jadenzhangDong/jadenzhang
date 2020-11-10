package com.example.demo.leetcode;

import org.junit.Test;

public class IsPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        //定义快慢指针
        ListNode slow = head, fast = head;
        //遍历链表，获取链表中间位置，快指针：慢指针 2：1 ，快指针走完，慢指针走到一半
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        //判断链表中间点
        if(fast!=null){
            slow = slow.next;
        }
        //生成新的链表，并反转链表
        ListNode reverseList = reverseList(slow);
        while(reverseList!=null){
            if(head.val!=reverseList.val){
                return false;
            }
            head = head.next;
            reverseList = reverseList.next;
        }
        return true;

    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return prev;
    }


    /*Definition for singly-linked list.*/
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    @Test
    public void test(){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        System.out.println(isPalindrome(listNode));
    }

}
