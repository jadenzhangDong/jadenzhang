package com.example.demo.leetcode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        //动态规划函数：dp[i][j] = math.min(dp[i-1][j-1],dp[i-1][j])+triangle[i][j]
        int x = triangle.size();
        int y = triangle.get(triangle.size()-1).size();
        int[][] dp = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i ; j++) {
                if(i==0 && j==0){
                    dp[i][j] = triangle.get(0).get(0);
                    continue;
                }else if(i>0 && j==0){
                    dp[i][j] = dp[i-1][j] + triangle.get(i).get(j);
                }else if(i>0 && j==i){
                    dp[i][j] = dp[i-1][j-1] + triangle.get(i).get(j);
                }else {
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j]) + triangle.get(i).get(j);
                }
            }
        }
        int [] a = dp[x-1];
        Arrays.sort(a);
        return a[0];
    }

    @Test
    public void test(){
        List<Integer> a = new ArrayList<>();
        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
        List<Integer> c = new ArrayList<>();
        c.add(6);
        c.add(5);
        c.add(7);
        List<Integer> d = new ArrayList<>();
        d.add(4);
        d.add(1);
        d.add(8);
        d.add(3);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(a);
        lists.add(b);
        lists.add(c);
        lists.add(d);
        System.out.println(minimumTotal(lists));
    }
}
