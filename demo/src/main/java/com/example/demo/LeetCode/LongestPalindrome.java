package com.example.demo.LeetCode;

public class LongestPalindrome {
    private int left, maxLen;
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2){
            return s;

        }
        for (int i = 0; i < s.length() - 1; i++) {
            //考虑两种情况：1.中间是bab;2.中间是bb;
            findMaxPalindrome(s, i, i);
            findMaxPalindrome(s, i, i + 1);

        }

        return s.substring(left, left + maxLen);
    }

    private void findMaxPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {

            i--;
            j++;
        }
        if (maxLen < j - i - 1) {
            left = i+1;
            maxLen = j - i - 1;
        }
    }
}
