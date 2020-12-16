package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        char[] chars = pattern.toCharArray();
        Map<Character, String> tmpMap = new HashMap<>();
        Set<String> tmpSet = new HashSet<>();
        if(s1.length!=chars.length || s.isEmpty() || pattern.isEmpty()){
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if(tmpMap.containsKey(chars[i])){
                if(!tmpMap.get(chars[i]).equals(s1[i])){
                    return false;
                }
                continue;
            }
            tmpMap.put(chars[i], s1[i]);
            if(!tmpSet.add(s1[i])){
                return false;
            }
        }
        return true;
    }

    @Test
    public void test(){
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }
}
