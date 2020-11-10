package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> returnResult = new ArrayList<>();
        char[] chars = S.toCharArray();
        Map<Character, Integer> location = new HashMap<>();
        //记录每个字符最大位置
        for (int i=0; i<chars.length; i++) {
            location.put(chars[i], i);
        }
        //设置两个指针记录需要截取的位置
        int left = 0;
        int right = location.get(chars[0]);
        //遍历，移动两个指针，获取需要截取的位置
        for (int i=0; i<chars.length; i++) {

            //判断当前位置是否位最大位置
            if(right>i){
                //未到最大位置则判断是否需要更新位置
                right = right<(location.get(chars[i]))?location.get(chars[i]):right;
                continue;
            }
            //已到最大位置则输出上一段位置，并更新指针信息
            returnResult.add((right-left)+1);
            if(i+1<chars.length){
                left = i+1;
                right = location.get(chars[i+1]);
            }
        }
        return returnResult;
    }


    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij");

    }
}
