package com.example.demo.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        //return getMaxPath1(1, 1, m, n,);
        //return getMaxPath2(1, 1, m, n,new HashMap<>());
        return getMaxPath3(m, n);
    }

    /**
     * 使用递归方式实现动态规划 1
     * @param i
     * @param j
     * @param m
     * @param n
     * @return
     */
    private int getMaxPath1(int i, int j, int m, int n){
        //边界问题
        if(i>m || j>n){
            return 0;
        }
        if(i==m && j==n){
            return 1;
        }
        int right = getMaxPath1(i+1, j, m, n);
        int down = getMaxPath1(i, j+1, m, n);

        return right + down;
    }

    /**
     * 使用递归方式实现动态规划 2
     * @param i
     * @param j
     * @param m
     * @param n
     * @param map
     * @return
     */
    private int getMaxPath2(int i, int j, int m, int n, Map<String, Integer> map){
        //边界问题
        if(i>m || j>n){
            return 0;
        }
        if(i==m && j==n){
            return 1;
        }
        //通过map存储结果，以免重复计算
        String key = i + " *" + j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int right = getMaxPath1(i+1, j, m, n);
        int down = getMaxPath1(i, j+1, m, n);
        int total = right + down;
        map.put(key, total);
        return total;
    }


    /**
     * 使用循环实现动态规划
     * @param m
     * @param n
     * @return
     */
    private int getMaxPath3(int m, int n){
        //构建二维数组
        int[][] dp = new int[m][n];
        //将数组中的位置都填为1
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;

        }
        
        //自底向上进行递推
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }








    @Test
    public void test(){
        System.out.println(uniquePaths(7,3));
    }
}
