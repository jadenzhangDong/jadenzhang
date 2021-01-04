package com.example.demo.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)  return 0;

        //先将数组排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int m = 1;
        for (int i = 1; i < n; i++) {
            if(intervals[i][0]>=right){
                m++;
                right = intervals[i][1];
            }
        }
        return n-m;
    }

}
