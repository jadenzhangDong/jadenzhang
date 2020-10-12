package com.example.demo.LeetCode;

public class TwoNumbers {
    /**
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        // write code here
        ListNode dumy = new ListNode(0);
        ListNode pre = dumy;
        int carry = 0;
        while(l1!=null || l2!=null){
            int d1 =(l1!=null)?0:l1.value;
            int d2 =(l2!=null)?0:l2.value;

            int sum = d1 + d2 + carry;
            carry = (sum>=10)?1:0;
            pre.nextNode = new ListNode(sum % 10);
            pre = pre.nextNode;

            if (l1!=null) l1 = l1.nextNode;
            if (l2!=null) l2 = l2.nextNode;


        }
        if(carry == 1){
            pre.nextNode = new ListNode(1);
        }

        return dumy.nextNode;



    }
    public static void main(String[] args) {
    }
}
class ListNode {
    public int value;
    public ListNode nextNode;

    public ListNode(int value){
        this.value = value;
    }
}


