package com.example.demo.leetcode;

import org.junit.Test;
import sun.security.acl.WorldGroupImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetValidT9Words {
    public List<String> getValidT9Words(String num, String[] words) {
        List<String> returnList = new ArrayList<>();
        //初始化map，存放字典
        Map<Character, String> dict = new HashMap<>();
        dict.put('a', "2");dict.put('b', "2");dict.put('c', "2");dict.put('d', "3");dict.put('e', "3");dict.put('f', "3");
        dict.put('g', "4");dict.put('h', "4");dict.put('i', "4");dict.put('j', "5");dict.put('k', "5");dict.put('l', "5");
        dict.put('m', "6");dict.put('n', "6");dict.put('o', "6");dict.put('p', "7");dict.put('q', "7");dict.put('r', "7");dict.put('s', "7");
        dict.put('t', "8");dict.put('u', "8");dict.put('v', "8");dict.put('w', "9");dict.put('x', "9");dict.put('y', "9");dict.put('z', "9");

        String tmp;
        for (int i = 0; i < words.length; i++) {
            tmp = "";
            for (int j = 0; j < words[i].length(); j++) {
                tmp += dict.get(words[i].charAt(j));
            }
            if (tmp.equals(num)){
                returnList.add(words[i]);
            }
        }
        return returnList;
    }

    @Test
    public void test(){
        String num = "";
        String[] words = {};
        System.out.println(getValidT9Words(num, words));
    }
}
