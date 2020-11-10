package com.example.demo.leetcode;

import org.springframework.stereotype.Controller;

import java.util.LinkedList;

@Controller
public class LeetCodeTest03 {
    public String longestCommonPrefix(String[] strs) {
        int a = strs.length;
        int t = a;
        int temp = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<strs.length;i++){
            b = strs[i].length();
            c = strs[t-i].length();
            temp = b<c?b:c;
            a= a>temp?temp:a;
            if(t-i-i<2){
                break;
            }
        }
        for(int i=0;i<a;i++){

        }

        new String();
        LinkedList<Object> objects = new LinkedList<>();
        objects.get(1);



        return "";
    }
}
