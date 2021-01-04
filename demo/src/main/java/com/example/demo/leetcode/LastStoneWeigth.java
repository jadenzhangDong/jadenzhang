package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LastStoneWeigth {

    public int lastStoneWeigth(int[] stones){
        Integer[] integers = new Integer[stones.length];
        if(stones.length==0) return 0;
        if(stones.length==1) return stones[0];
        for (int i = 0; i < stones.length; i++) {
            integers[i] = stones[i];
        }
        return digui(integers);
    }

    public int digui(Integer[] stones){
        //递归终止条件
        Arrays.sort(stones, Collections.reverseOrder());
        if(stones[1]==0){
            return stones[0];
        }

        if(stones[0]==stones[1]){
            stones[0] = 0;
            stones[1] = 0;
        }else if(stones[0]>stones[1]){
            stones[0] = stones[0] - stones[1];
            stones[1] = 0;
        }else{
            stones[1] = stones[1] - stones[0];
            stones[0] = 0;
        }
        return digui(stones);
    }

    @Test
    public void test(){
        int[] a = {1,1};
        System.out.println(lastStoneWeigth(a));
    }

}
