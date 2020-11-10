package com.example.demo.leetcode;

public class Reverse {
    /**
     *
     * @param x int整型
     * @return int整型
     */
    public static int reverse (int x) {
        // write code here
        boolean goon = true;
        int returnValue = 0;
        while(goon){
            int a = x % 10;
            returnValue = returnValue*10 + a;
            x = x/10;
            if(x==0){
                goon = false;
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(reverse(999999999));
    }
}
