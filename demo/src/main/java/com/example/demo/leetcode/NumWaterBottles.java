package com.example.demo.LeetCode;

import org.junit.Test;

public class NumWaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int shengyu = numBottles;
        int duihuan = 0;
        int tmptotal = shengyu + duihuan;
        int returnNum = tmptotal;
        while(tmptotal>=numExchange){
            shengyu = tmptotal % numExchange;
            duihuan = tmptotal / numExchange;
            tmptotal = shengyu + duihuan;
            returnNum += duihuan;
        }
        return returnNum;
    }

    @Test
    public void test(){
        System.out.println(numWaterBottles(2, 3));
    }
}
