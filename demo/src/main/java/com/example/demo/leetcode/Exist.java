package com.example.demo.LeetCode;

import org.junit.Test;

public class Exist {
    public boolean exist(char[][] board, String word) {
        //定位初始位置，并调用帮助类进行字符串比对
        int[][] existFlag = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==word.charAt(0)){
                    existFlag[i][j] = 1;
                    if(helper(board, i, j, word, 0, existFlag)){
                        return true;
                    }
                    existFlag[i][j] = 0;
                }
            }
        }
        return false;
    }

    public boolean helper(char[][] board, int i, int j, String word, int index, int[][] existFlag){
        index++;
        //递归比较完成退出条件
        if(index>=word.length()) return true;

        //递归比较，失败直接退出
        //左
        if(j-1>=0 && existFlag[i][j-1]!=1){
            if(board[i][j-1] == word.charAt(index)){
                existFlag[i][j-1] = 1;
                if(helper(board, i, j-1, word, index, existFlag)){
                    return true;
                }
                existFlag[i][j-1] = 0;
            }
        }
        //下
        if(i+1<board.length && existFlag[i+1][j]!=1){
            if(board[i+1][j] == word.charAt(index)){
                existFlag[i+1][j] = 1;
                if(helper(board, i+1, j, word, index, existFlag)){
                    return true;
                }
                existFlag[i+1][j] = 0;
            }
        }
        //右
        if(j+1<board[i].length && existFlag[i][j+1]!=1){
            if(board[i][j+1] == word.charAt(index)){
                existFlag[i][j+1] = 1;
                if(helper(board, i, j+1, word, index, existFlag)){
                    return true;
                }
                existFlag[i][j+1] = 0;
            }
        }
        //上
        if(i-1>=0 && existFlag[i-1][j]!=1){
            if(board[i-1][j] == word.charAt(index)){
                existFlag[i-1][j] = 1;
                if(helper(board, i-1, j, word, index, existFlag)){
                    return true;
                }
                existFlag[i-1][j] = 0;
            }
        }
        return false;
    }

    @Test
    public void test(){
        char[][] a = {{'c','a','a'}, {'a','a','a'}, {'b','c','d'}};
        String word = "aab";
        System.out.println(exist(a, word));
    }
}
