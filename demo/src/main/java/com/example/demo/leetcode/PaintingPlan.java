package com.example.demo.LeetCode;

import org.junit.Test;

public class PaintingPlan {
    public int paintingPlan(int n, int k) {
        if((k%n)!=0) return 0;
        if(k==0 || n*n==k) return 1;
        return 2*(n+1-k/n);
    }

    @Test
    public void test(){
        System.out.println(paintingPlan(3, 6));
    }
}
