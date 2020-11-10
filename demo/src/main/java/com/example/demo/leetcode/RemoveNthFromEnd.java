package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode cur = head;
        int a = 0;
        for (int i=0;;i++){
            if(cur==null){
                break;
            }
            map.put(i,cur);
            cur = cur.next;
            a = i;
        }

        //判断需要移除的位置 a-n 需要移除的位置
        if(map.size()==n){
            head = head.next;
        }else{
            ListNode listNode = map.get(a - n);
            //判断索引的位置与需要缩减的位置
            listNode.next = listNode.next.next;
        }

        return head;

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  @Test
  public void test(){
      ListNode node1 = new ListNode(1);
//      ListNode node2 = new ListNode(2);
//      ListNode node3 = new ListNode(3);
//      ListNode node4 = new ListNode(4);
//      ListNode node5 = new ListNode(5);
//      node4.next = node5;
//      node3.next = node4;
//      node2.next = node3;
//      node1.next = node2;

      removeNthFromEnd(node1, 1);
  }

    //使用快慢指针，让快慢指针的差相差为n，即可寻找到需要删除的节点
    public ListNode tijie(ListNode head, int n) {
        if(head == null) return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode fast = pre;
        ListNode slow = pre;
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }

}
