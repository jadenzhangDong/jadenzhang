package com.example.demo.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SwapPairs {




    public static ListNode swapPairs(ListNode head) {
        List<ListNode> list1 = new ArrayList<ListNode>();
        List<ListNode> list2 = new ArrayList<ListNode>();
        ListNode currentNode = head;
        int a = 1;
        if(currentNode.next==null){
            return head;
        }

        while(currentNode!=null){
            ListNode tempNode = currentNode;
            currentNode = currentNode.next;
            tempNode.next = null;
            if(a%2==1){
                list1.add(tempNode);
            }else {
                list2.add(tempNode);
            }
            a++;
        }
        ListNode returnNode = new ListNode(0);
        ListNode last = returnNode;
        for (int i = 0; i < list1.size(); i++) {
            if(i<list2.size()){
                last.next = list2.get(i);
                last = last.next;
            }
            last.next = list1.get(i);
            last = last.next;
        }
        return returnNode.next;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,null))));
        ListNode returnNode = swapPairs(node);
        while (true){
            System.out.println(returnNode.val);
            returnNode = returnNode.next!=null? returnNode.next:null;
            if (returnNode == null){
                break;
            }
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}



