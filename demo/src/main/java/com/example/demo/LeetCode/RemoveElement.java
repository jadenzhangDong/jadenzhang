package com.example.demo.LeetCode;

import org.junit.Test;

import java.lang.reflect.Array;


public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int head = 0,last = nums.length-1;
        do{
            if(nums[head]==val){
                nums[head] = nums[last];
                last--;
                continue;
            }
            head++;
        }while(head<=last);

        return last+1;
    }

    @Test
    public void test(){
        System.out.println(removeElement(new int[]{2},2));
    }
}
