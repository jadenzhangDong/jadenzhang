package com.example.demo.LeetCode;

public class IsPalindrome {
    /**
     *
     * @param x int整型
     * @return bool布尔型
     */
    public static boolean isPalindrome(int x) {
        // write code here
        boolean returnValue = false;
        if(x<0){
            return returnValue;
        }
        int a = x;
        boolean goon = true;
        int value = 0;
        while(goon){
            int b = a % 10;
            value = value*10 + b;
            a = a/10;
            if(a==0){
                goon = false;
            }
        }
        if(value == x){
            returnValue = true;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
}
