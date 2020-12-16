package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!integers.add(nums[i])){
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Test
    public void test(){
        int[] a = {};
        System.out.println(containsDuplicate(a));
    }

}
