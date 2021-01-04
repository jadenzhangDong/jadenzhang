package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int left = 0;
        int right = length;
        while(true){
            if(right==left){
                return right;
            }
            int i = (right+left)/2;
            if(nums[i]==i){
                left = i+1;
            }else if(nums[i]>i){
                right = i;
            }
        }
    }

    @Test
    public void test(){
        int[] a = {};
        System.out.println(missingNumber(a));
    }
}
