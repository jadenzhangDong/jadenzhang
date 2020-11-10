package com.example.demo.leetcode;

import org.junit.Test;

public class CountAndSay {
    public String countAndSay(int n) {
        //递归终止的条件
        if(n==1){
            return "1";
        }
        StringBuffer returnStr = new StringBuffer();
        char[] chars = countAndSay(n - 1).toCharArray();
        //创建两个指针
        int count = 0;
        char num = chars[0];
        //遍历返回的数据，并组装数据
        for (int i=0; i<chars.length; i++) {
            if(chars[i] != num){

                //拼接字符串并重置指针
                returnStr.append(count).append(num);
                count = 1;
                num = chars[i];

                continue;
            }
            count++;
        }
        return returnStr.append(count).append(num).toString();
    }

    @Test
    public void test(){
        System.out.println(countAndSay(6));
    }

    /**
     * 题解
     * @param n
     * @return
     */
    public String tijie(int n){
        // 递归终止条件
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        // 拿到上一层的字符串
        String str = countAndSay(n - 1);
        int length = str.length();
        // 开始指针为0
        int start = 0;
        // 注意这从起始条件要和下面长度统一
        for (int i = 1; i < length + 1; i++) {
            // 字符串最后一位直接拼接
            if (i == length) {
                res.append(i - start).append(str.charAt(start));
                // 直到start位的字符串和i位的字符串不同，拼接并更新start位
            } else if (str.charAt(i) != str.charAt(start) ) {
                res.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return res.toString();
    }
}
