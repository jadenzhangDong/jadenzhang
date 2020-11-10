package com.example.demo.leetcode;

public class LeetCodeTest01 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("[" + ints[0] + " " + ints[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j]==(target - nums[i])) {
                    System.out.println("[" + i + " " + j + "]");
                    a=i;
                    b=j;
                }
            }
        }
        return new int[]{a,b};
    }

    public void test(){
        String s = String.valueOf(121);
        char[] chars = s.toCharArray();
        int length = chars.length;
        int a = length/2;
        if (length%2==1){
            a += 1;
        }
        for(int i= a;i<=length;i++){
            if(chars[i] == chars[length-i]){
            }
        }
    }
}
