package com.example.demo.leetcode;

import org.junit.Test;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //动态规划函数：dp[i][j] = dp[i-1][j]+dp[i][j-1]
        int x = obstacleGrid.length;
        int y = obstacleGrid[0].length;
        int[][] dp = new int[x][y];
        if (obstacleGrid[x-1][y-1]==1 || obstacleGrid[0][0]==1) {
            return 0;
        }
        //边界全部设定为 +1
        for (int i = 0; i < dp[0].length; i++) {
            if(obstacleGrid[0][i]==1){
                break;
            }
            dp[0][i] = 1;
        }
        for (int i = 0; i < dp.length; i++) {
            if(obstacleGrid[i][0]==1){
                break;
            }
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[x-1][y-1];
    }

    @Test
    public void test(){
        int[][] a = {{0}};
        System.out.println(uniquePathsWithObstacles(a));
    }
}
