package com.example.demo.leetcode;

import java.math.BigDecimal;
import java.util.HashSet;

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

    public int myAtoi(String s) {
        HashSet<String> strings = new HashSet<>();
        strings.add("0");
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");
        String returnStr = "";
        int returnNum = 0;
        String flag = "+";
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if (str.equals(" ")) {
                continue;
            } else if (str.equals("-")) {
                if (returnStr != "") {
                    break;
                } else {
                    flag = "-";
                }
            } else if (strings.contains(str)) {
                returnStr = returnStr + str;
            } else {
                break;
            }
        }
        if (returnStr != "") {
            if (flag == "-") {
                returnStr = "-" + returnStr;
            }
            BigDecimal bigInteger = new BigDecimal(returnStr);
            if (bigInteger.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE)) == -1) {
                return Integer.MIN_VALUE;
            }
            if (bigInteger.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) == 1) {
                return Integer.MAX_VALUE;
            }
            returnNum = bigInteger.intValue();
        }


        return returnNum;
    }
}
