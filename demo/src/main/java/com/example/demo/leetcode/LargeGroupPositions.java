package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        char tmpChar = 0;
        int start = 0;
        int end = 0;
        List<List<Integer>> returnLists = new ArrayList<>();
        List<Integer> a;
        for (int i=0; i<s.length(); i++) {
            if(tmpChar==0){
                tmpChar = s.charAt(i);
            }else if(tmpChar!=s.charAt(i)){
                if(end-start>1){
                    a = new ArrayList<>();
                    a.add(start);
                    a.add(end);
                    returnLists.add(a);
                }
                start = i;
                tmpChar = s.charAt(i);
            }
            end = i;
        }
        if(end-start>1){
            a = new ArrayList<>();
            a.add(start);
            a.add(end);
            returnLists.add(a);
        }
        return returnLists;
    }

    @Test
    public void test(){
        System.out.println(largeGroupPositions("aaa"));
    }
}
