package com.example.demo.LeetCode;

import java.util.*;

public class Merge {
    public int[][] merge(int[][] intervals) {
        //对二维数组进行排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        //定义临时区间
        List<int[]> list = new ArrayList<>();
        int[] l1;
        int[] tmp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            //判断当前区间与上一个区间大小
            if(intervals[i][0]<=tmp[1]){
                if(intervals[i][1]>tmp[1]){
                    tmp[1] = intervals[i][1];
                }
            }else{
                l1 = new int[2];
                l1[0] = tmp[0];
                l1[1] = tmp[1];
                list.add(l1);
                tmp[0] = intervals[i][0];
                tmp[1] = intervals[i][1];
            }
        }
        l1 = new int[2];
        l1[0] = tmp[0];
        l1[1] = tmp[1];
        list.add(l1);
        int[][] ints = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }

        return ints;
    }
}
