package com.example.demo.LeetCode;

import org.junit.Test;

public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        int maxI = matrix.length-1, maxJ = matrix[0].length-1;
        int minI = 0, minJ = 0;
        int i = 0, j = 0;
        int[] ints = new int[maxI*maxJ];
        int index = 0;
        while (true){
            if(maxI==minI && maxJ==minJ){
                break;
            }

            ints[index] = matrix[i][j];
            index++;

            if((i==minI&&j==minJ)){
                if(minI!=0&&minJ!=0){
                    minJ++;
                }
                j++;
            }else if(i==minI&&j<maxJ){
                j++;
            }else if(i<maxI&&j==maxJ){
                if(i==minI){
                    minI++;
                }
                i++;
            }else if(i==maxI&&j==maxJ){
                maxJ--;
                j--;
            }else if(i==maxI&&j>minJ){
                j--;
            }else if(i==maxI&&j==minJ){
                maxI--;
                j--;
            }else if(i>minI&&j==minJ){
                j--;
            }

        }


        return ints;
    }

    @Test
    public void test(){
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        System.out.println(spiralOrder(a));
    }
}
