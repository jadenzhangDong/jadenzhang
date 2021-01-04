package com.example.demo.LeetCode;

import org.junit.Test;

public class FibI {
    public int fib(int n) {
        int i = fib2(n);
        return i%1000000007;
    }

    public int fib2(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        return fib(n-1) + fib(n-2);
    }

    @Test
    public void test(){
        System.out.println(fib(100));
    }

}
