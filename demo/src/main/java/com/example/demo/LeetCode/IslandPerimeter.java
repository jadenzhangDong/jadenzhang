package com.example.demo.LeetCode;

import org.junit.Test;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int landLength = 0;
        //遍历数组，临海和边界就+1，陆地就不做处理
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1){
                    int lefti = i-1;
                    int righti = i+1;
                    int leftj = j-1;
                    int rightj = j+1;
                    //四种情况i+，i-，j+，j-
                    if(lefti<0){
                        landLength++;
                    }else{
                        if(grid[lefti][j] == 0){
                            landLength++;
                        }
                    }
                    if(righti==grid.length){
                        landLength++;
                    }else{
                        if(grid[righti][j] == 0){
                            landLength++;
                        }
                    }
                    if(leftj<0){
                        landLength++;
                    }else {
                        if(grid[i][leftj] == 0){
                            landLength++;
                        }
                    }
                    if(rightj==grid[i].length){
                        landLength++;
                    }else {
                        if(grid[i][rightj] == 0){
                            landLength++;
                        }
                    }
                }
            }
        }

        return landLength;
    }
    @Test
    public void test(){
        int[][] arr = {{0,1,0,0},{1,1,1,0}, {0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(arr));
    }
}
