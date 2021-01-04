package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        int n = nums.length;
        int returnNum = 0;
        Deque<Integer> integers = new LinkedList<>();
        Deque<Integer> integers1;
        integers.offer(-nums[0]);
        integers.offer(nums[0]);
        for (int i = 1; i < n; i++) {
            integers1 = new LinkedList<>();
            while (!integers.isEmpty()){
                integers1.offer(integers.peek()-nums[i]) ;
                integers1.offer(integers.poll()+nums[i]) ;
            }
            integers = integers1;
        }
        while (!integers.isEmpty()){
            if(integers.poll()==S){
                returnNum++;
            }
        }

        return returnNum;
    }

    @Test
    public void test(){
        int[] a = {1, 1, 1, 1, 1};
        System.out.println(findTargetSumWays(a,3));
    }
}
