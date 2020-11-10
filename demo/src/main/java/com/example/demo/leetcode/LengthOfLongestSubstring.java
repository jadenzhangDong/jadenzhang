package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        //字符串转为数组
        char[] chars = s.toCharArray();
        //定义两个最大距离和重复数字指针
        int max = 0, left = 0;
        //定义hashmap保存不同字符下标
        Map<Character, Integer> map = new HashMap<>();
        //遍历数组，移动窗口，获取最大的长度
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                left = Math.max(left,map.get(chars[i])+1);
            }

            map.put(chars[i], i);
            max = Math.max(max, i-left+1);

        }

        return max;
    }
    @Test
    public void test(){
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
