package com.example.demo.LeetCode;

import org.junit.Test;

public class Rotate {
    /**
     * 先沿着对角线翻折，再沿着垂直线对称翻折
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length/2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length-1-j];
                matrix[i][matrix[i].length-1-j] = tmp;
            }
        }
        System.out.println(matrix);
    }

    @Test
    public void test(){
        int[][] a = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(a);
    }
}
