package com.example.demo.leetcode;

import org.junit.Test;

import java.util.*;

public class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        /**
         * 1。建立两个对列，分别放入r和d
         * 2。获取队列头进行比较，较小的则继续放入队列
         * 3。循环比较，直到有一方为空为止
         *
         */
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int radiantIndex = radiant.poll(), direIndex = dire.poll();
            if(radiantIndex < direIndex){
                radiant.offer(radiantIndex + n);
            }else{
                dire.offer(direIndex + n);
            }
        }
        return radiant.isEmpty()?"Dire":"Radiant";
    }





    @Test
    public void test(){
        System.out.println(predictPartyVictory("RDD"));
    }
}
