package com.example.demo.leetcode;

import org.junit.Test;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] returnArray = new int[A.length];
        int ji = 1;
        int ou = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0){
                returnArray[ou] = A[i];
                ou+=2;
            }else{
                returnArray[ji] = A[i];
                ji+=2;
            }
        }

        return returnArray;
    }
    @Test
    public void test(){
        int[] A = {4,2,5,7};
        this.sortArrayByParityII(A);
    }
}
