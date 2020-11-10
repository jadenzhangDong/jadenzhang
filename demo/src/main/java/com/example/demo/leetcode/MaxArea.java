package com.example.demo.leetcode;

public class MaxArea {
    /**
     *
     * @param height int整型一维数组
     * @return int整型
     */
    public static int maxArea(int[] height) {
        // write code here
        int maxArea = 0;
        int reduce = 0;
        int lowHegit = 0;
        for (int i=0; i<height.length ;i++) {
            for (int j=i+1; j<height.length ;j++) {
                if(height[i]>=height[j]){
                    lowHegit = height[j];
                }else{
                    lowHegit = height[i];
                }
                reduce = j - i;

                int tempArea = reduce * lowHegit;
                maxArea = maxArea>=tempArea?maxArea:tempArea;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(ints);
        System.out.println(
                i
        );
    }
}
