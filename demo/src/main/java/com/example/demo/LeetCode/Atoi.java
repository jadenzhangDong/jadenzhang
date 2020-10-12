package com.example.demo.LeetCode;

public class Atoi {
    public int atoi (String str) {
        if (str == null || str.trim().length() < 1){
            return 0;
        }
        char[] arr = str.trim().toCharArray();
        int sign = 1, index = 0;
        if (arr[0] == '+'){
            index++;
        }
        if (arr[0] == '-') {
            sign = -1;
            index++;
        }
        int num = 0;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] - '0' >= 0 && arr[i] - '9' <= 0) {
                if (num > Integer.MAX_VALUE / 10 || num == Integer.MAX_VALUE / 10 && arr[i] - '7' > 0) {
                    if (sign > 0){
                        return Integer.MAX_VALUE;
                    }
                    else{
                        return Integer.MIN_VALUE;
                    }
                }
                num = 10 * num + arr[i] - '0';
            } else{
                break;
            }
        }
        return num * sign;
    }
}
