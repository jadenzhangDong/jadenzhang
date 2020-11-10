package com.example.demo.leetcode;

import java.util.HashSet;

public class LongestSubstring {
    /**
     *
     * @param s string字符串
     * @return int整型
     */
    public static int lengthOfLongestSubstring (String s) {
        // write code here
        int alength = s.length();
        int tempLength = 0;
        int maxLength=0;
        HashSet<Character> chars1 = new HashSet<Character>();
        char[] chars = s.toCharArray();
        for (int i=0; i<alength ; i++) {
            chars1.add(chars[i]);
            for (int j=i+1; j<alength ; j++){
                boolean add = chars1.add(chars[j]);
                if(!add){
                    tempLength = chars1.size();
                    if(maxLength<tempLength){
                        maxLength = tempLength;
                    }
                    chars1.clear();
                    break;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco");
    }


}
