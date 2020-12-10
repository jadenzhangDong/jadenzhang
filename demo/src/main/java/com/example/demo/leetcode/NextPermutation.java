package com.example.demo.leetcode;

public class NextPermutation {
    /**
     * 思路：依据官方题解，先从后向前寻找非升序的数字，再次遍历，
     * 寻找到比非升序的数字大的数字，进行交换，交换后翻转非升序数字之后的元素
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //寻找大于first的数字
        if(i>=0){
            int j = nums.length - 1;
            while(j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
