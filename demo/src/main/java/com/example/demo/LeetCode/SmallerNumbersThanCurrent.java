package com.example.demo.LeetCode;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        int[] returnArray = new int[nums.length];
        Map<Integer, Integer> returnMap = new HashMap<>();
        quickSort(tmp, 0, tmp.length-1);
        for (int i=0; i<tmp.length; i++){
            returnMap.putIfAbsent(tmp[i], i);
        }
        for (int i=0; i<nums.length; i++){
            returnArray[i] = returnMap.get(nums[i]);
        }
        return returnArray;
    }

    public void quickSort(int[] a, int lo0, int hi0){
        int lo = lo0;    //相当于i，左
        int hi = hi0;    //相当于j,  右

        if (lo >= hi)   // 判断是否到中间了
            return;

        //确定指针方向的逻辑变量，也就是从左搜索还是向右搜索
        boolean transfer=true;

        while (lo != hi) {
            if (a[lo] > a[hi]) {
                //交换数字
                int temp = a[lo];
                a[lo] = a[hi];
                a[hi] = temp;
                //决定下标移动，还是上标移动
                transfer = (transfer == true) ? false : true;
            }

            //将指针向前或者向后移动
            if(transfer)
                hi--;
            else
                lo++;

            //显示每一次指针移动的数组数字的变化
      /*for(int i = 0; i < a.length; ++i) {
        System.out.print(a[i] + ",");
      }
      System.out.print(" (lo,hi) = " + "(" + lo + "," + hi + ")");
      System.out.println("");*/
        }

        //将数组分开两半，确定每个数字的正确位置
        lo--;
        hi++;
        quickSort(a, lo0, lo);
        quickSort(a, hi, hi0);
    }

    @Test
    public void test(){
        int[] ints = {7,7,7,7};
        smallerNumbersThanCurrent(ints);
    }

    public int[] tijie(int[] nums) {
            int[] count = new int[101];
            for(int i=0; i<nums.length; i++){
                count[nums[i]]++;
            }
            int pre = 0;
            int cur = 0;
            for(int i=1; i<count.length; i++){
                cur = count[i];
                count[i] = count[i-1] + pre;
                pre = cur;
            }
            count[0] = 0;
            int[] res = new int[nums.length];
            for(int i=0; i<nums.length; i++){
                res[i] = count[nums[i]];
            }
            return res;
    }


}
