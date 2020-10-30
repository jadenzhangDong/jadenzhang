package com.example.demo.LeetCode;

import org.junit.Test;

public class Mutiply {
    public String multiply(String num1, String num2) {
        Integer int1 = Integer.parseInt(num1);
        Integer int2 = Integer.parseInt(num2);
        Integer returnResult = int2 * int1;
        System.out.println(returnResult);
        return String.valueOf(returnResult);
    }

    @Test
    public void test(){
        this.multiply("9999999999999999999999999","9999999999999999999999999");
    }
}
