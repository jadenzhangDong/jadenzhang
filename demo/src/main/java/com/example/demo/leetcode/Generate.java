package com.example.demo.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> lastList;
        List<Integer> currentList = null;
        //处理边界问题，起始位置设置为1
        for (int i = 0; i < numRows; i++) {
            lastList = currentList;
            currentList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                currentList.add(j, cal(lastList, j));
            }
            returnList.add(currentList);
        }

        return returnList;
    }


    private Integer cal(List<Integer> lastList, int location){
        //处理边界问题，超出的范围设置为0
        if(lastList == null){
            return 1;
        }
        int a;
        int b;
        if(location-1<0){
            a = 0;
        }else{
            a = lastList.get(location-1);
        }
        if(location>=lastList.size()){
            b = 0;
        }else{
            b = lastList.get(location);
        }
        return a + b;
    }

    @Test
    public void test(){
        System.out.println(generate(0));
    }
}
