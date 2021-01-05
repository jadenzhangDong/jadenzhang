package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharII {
    public char firstUniqChar(String s) {
        int[] ints = new int[26];
        int[] location = new int[26];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ints[s.charAt(i)-97]==0){
                location[index] = s.charAt(i)-97;
                index++;
            }
            ints[s.charAt(i)-97]++;
        }
        for (int i = 0; i < location.length; i++) {
            if(ints[location[i]]==1) {
                return (char) (location[i]+97);
            }
        }
        return ' ';
    }

    @Test
    public void test(){
        System.out.println(firstUniqChar("leetcode"));
    }
}
