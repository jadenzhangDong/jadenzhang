package com.example.demo.LeetCode;

public class MedianSortedArrays {
    /**
     *
     * @param A int整型一维数组
     * @param B int整型一维数组
     * @return double浮点型
     */
    public static double findMedianSortedArrays(int[] A, int[] B) {
        // write code here
        int alength = A.length;
        int blength = B.length;
        //创建临时数组存放a,b数组
        int[] temp = new int[A.length + B.length];
        int pa = 0;
        int pb = 0;
        int ptemp = 0;
        double returns = 0.0;
        while(pa<alength && pb<blength){
            if(A[pa]<B[pb]){
                temp[ptemp] = A[pa];
                pa++;
            }else{
                temp[ptemp] = B[pb];
                pb++;
            }
            ptemp++;
        }
        while(pa<alength){
            temp[ptemp] = A[pa];
            pa++;
            ptemp++;
        }
        while(pb<blength){
            temp[ptemp] = B[pb];
            pb++;
            ptemp++;
        }
        int a = temp.length;
        if(a%2!=0){
            returns = temp[(a-1)/2];
        }else{
            returns = (temp[(a-1)/2]+temp[(a+1)/2])/2.0;
        }
        return returns;
    }

    public static void main(String[] args) {
        double medianSortedArrays = findMedianSortedArrays(new int[]{}, new int[]{2,3});
        System.out.println(medianSortedArrays);
    }
}
