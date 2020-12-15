package com.example.demo.leetcode;

import org.junit.Test;

import java.lang.reflect.Array;

public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        String s = String.valueOf(N);
        int moshu = 10;
        int tmpVal;
        if(N<10){
            return N;
        }
        for (int i = s.length()-1; i-1 >=0 ; i--) {
            if(s.charAt(i-1)>s.charAt(i)){
                tmpVal = N % moshu;
                N = N - tmpVal;
                N -= 1;
                s = String.valueOf(N);
            }
            moshu*=10;
        }
        return N;
    }

    @Test
    public void test(){
        System.out.println(monotoneIncreasingDigits(1234));
    }
}
