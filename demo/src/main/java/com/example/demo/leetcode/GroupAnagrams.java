package com.example.demo.leetcode;

import org.junit.Test;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnLists = new ArrayList<>();
        List<String> list;
        Map<String, List<String>> map = new HashMap<>();
        String str;
        for (int i = 0; i < strs.length; i++) {
            str = "";
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            for (int j = 0; j < chars.length; j++) {
                str += chars[j];
            }
            if(!map.containsKey(str.toString())){
                list = new ArrayList<>();
                list.add(strs[i]);
                map.put(str,list);
                continue;
            }
            list= map.get(str);
            list.add(strs[i]);
            map.put(str,list);
        }

        for (String s : map.keySet()) {
            returnLists.add(map.get(s));
        }

        return returnLists;
    }

    @Test
    public void test(){
      String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(a);
    }
}
