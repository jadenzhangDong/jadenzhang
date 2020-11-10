package com.example.demo.leetcode;

import org.junit.Test;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {

        //定义左右两个指针，分别从数组两头开始遍历
        int length = A.length;
        if(length<3){
            return false;
        }
        int leftIndex = 0;
        int rightIndex = length-1;
        while(leftIndex+1<length && A[leftIndex]<A[leftIndex+1]){
                leftIndex+=1;
        }
        while(rightIndex-1>=0 && A[rightIndex]<A[rightIndex-1]){
            rightIndex-=1;
        }
        return leftIndex>0 && rightIndex<length-1 && leftIndex == rightIndex;
    }

    @Test
    public void test(){
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(a));
    }

    public boolean tijie(int[] A){
        int N = A.length;
        int i = 0;

        // 递增扫描
        while (i + 1 < N && A[i] < A[i + 1]) {
            i++;
        }

        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == N - 1) {
            return false;
        }

        // 递减扫描
        while (i + 1 < N && A[i] > A[i + 1]) {
            i++;
        }

        return i == N - 1;
    }
}
