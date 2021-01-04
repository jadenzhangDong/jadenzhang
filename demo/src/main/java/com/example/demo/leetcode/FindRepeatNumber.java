package com.example.demo.LeetCode;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int[] ints = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            if((ints[nums[i]]+=1)>1){
                return nums[i];
            }
        }
        return 0;
    }
}
