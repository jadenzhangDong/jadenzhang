package com.example.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int getTarget = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i=0; i<numbers.length; i++) {
            map.put(numbers[i], i);
        }
        label:for (int i=0; i<numbers.length; i++) {
            getTarget = target - numbers[i];
            index1 = i;
            for (Integer integer1 : map.keySet()) {
                if(map.containsKey(getTarget)){
                    Integer integer = map.get(getTarget);
                    index2 = integer;
                    if(index1!=index2){
                        break label;
                    }
                }
            }
        }

        int c = 0;
        if(index1>index2){
            c = index1;
            index1 = index2;
            index2 = c;
        }
        return new int[]{index1+1, index2+1};
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{3,2,4}, 6);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}
