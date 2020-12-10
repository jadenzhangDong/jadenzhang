package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int price = 5;
        //创建收银台，hashmap
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(5, 0);
        counter.put(10, 0);
        counter.put(20, 0);
        //遍历数组，根据找零公式计算，收银台中的零钱是否足够
        for (int i = 0; i < bills.length; i++) {
            if(!(bills[i]-price == 0)){
                if(!cal(bills[i] - price, counter)){
                    return false;
                }
            }
            counter.put(bills[i], counter.get(bills[i])+1);
        }
        return true;
    }

    private boolean cal(int money, Map<Integer, Integer> counter){
        //根据需要找零的钱数计算
        if(money==5){
            if(counter.get(5)==0){
                return false;
            }
        }
        if(!counter.containsKey(money)){
            if(!cal(5, counter) || !cal(money-5, counter)){
                return false;
            }
        }else{
            if(counter.get(money)==0){
                if(money==5){
                    return false;
                }
                if(!cal(5, counter) || !cal(money-5, counter)){
                    return false;
                }
            }else{
                counter.put(money, counter.get(money)-1);
            }
        }
        return true;
    }
    @Test
    public void test(){
        int[] a = {5,5,5,20,5};
        System.out.println(lemonadeChange(a));
    }
}
