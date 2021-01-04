package com.example.demo.LeetCode;

import org.junit.Test;
import sun.security.validator.TrustStoreUtil;

import java.util.Arrays;

public class FindContentChildren{
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int sIndex = 0;
        int gIndex = 0;
        int returnNum = 0;
        while (true) {
            if(sIndex==s.length || gIndex==g.length) break;

            if(g[gIndex] <= s[sIndex]){
                returnNum++;
                sIndex++;
                gIndex++;
            }else{
                sIndex++;
            }
        }
        return returnNum;
    }

    @Test
    public void test(){
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g, s));
    }
}
