package com.example.demo.leetcode;

import org.junit.Test;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        //创建两个set,遍历数据，并保存
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        //create need iter set
        Set<Integer> iterSet;
        Set<Integer> ifSet;
        if(set1.size()<=set2.size()){
            iterSet = set1;
            ifSet = set2;
        }else{
            iterSet = set2;
            ifSet = set1;
        }
        List<Integer> integers = new ArrayList<>();
        for (Integer integer : iterSet) {

            if(ifSet.contains(integer)){
                integers.add(integer);
            }
        }
        Integer[] integers1 = new Integer[integers.size()];
        int[] returnInt = Arrays.stream(integers.toArray(integers1)).mapToInt(Integer::valueOf).toArray();
        return returnInt;
    }
    @Test
    public void test(){
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};

        System.out.println(intersection(a, b));
    }
}
