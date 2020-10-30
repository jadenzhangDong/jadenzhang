package com.example.demo.LeetCode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] zints = new int[1001];
        int[] fints = new int[1001];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                zints[arr[i]]++;
            }else{
                fints[-arr[i]]++;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < zints.length; i++) {
            if(zints[i]==0){
                continue;
            }
            if(!set.add(zints[i])){
                return false;
            }

        }
        for (int i = 1; i < fints.length; i++) {

            if(fints[i]==0){
                continue;
            }
            if(!set.add(fints[i])){
                return false;
            }

        }

        return true;
    }

    @Test
    public void test(){
        int[] ints = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(ints));
    }
}
