package com.example.demo.LeetCode;

import java.util.*;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            charMap.put(a, charMap.getOrDefault(a, 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(charMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
