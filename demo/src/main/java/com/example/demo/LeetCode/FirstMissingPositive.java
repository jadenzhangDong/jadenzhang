package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int bit[] = new int[(length - 1) / 32 + 1];
        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            //数组必须在1到length之间才有效
            if (digit >= 1 && digit <= length) {
                int index = (digit - 1) / 32;
                bit[index] |= (1 << ((digit - 1) % 32));
            }
        }
        //最后在执行一遍循环，查看对应位置的元素是否正确，如果不正确直接返回
        for (int i = 0; i < nums.length; i++) {
            if ((bit[i / 32] & (1 << (i % 32))) == 0)
                return i + 1;
        }
        return length + 1;
    }

    @Test
    public void test(){
        int[] ints = {2147483647};
        System.out.println(firstMissingPositive(ints));
    }
}
