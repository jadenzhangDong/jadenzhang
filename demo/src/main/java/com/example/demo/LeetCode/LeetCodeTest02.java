package com.example.demo.LeetCode;

public class LeetCodeTest02 {
    public boolean isPalindrome(int x){
        boolean returnResult = false;
        int temp = 0;
        int a = Math.abs(x);
        for (int i=0;i<String.valueOf(x).length();i++){

            temp = temp*10+a%10;
            a = a/10;
        }
        if(x == temp){
            returnResult = true;
        }
        return returnResult;
    }

    public static void main(String[] args) {
        LeetCodeTest02 leetCodeTest02 = new LeetCodeTest02();
        System.out.println(leetCodeTest02.isPalindrome(-10));
    }
}

