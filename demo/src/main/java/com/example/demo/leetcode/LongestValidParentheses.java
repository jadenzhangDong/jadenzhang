package com.example.demo.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int[] location = new int[chars.length];
        int retNum = 0, tmpNum = 0;
        //使用栈来实现 将未匹配的符合放入到栈，匹配则移除
        for (int i = 0; i < chars.length; i++) {
            if(!stack.empty() && chars[i]==')'){
                location[stack.pop()] = 1;
                location[i] = 1;
            }else{
                if(chars[i]=='('){
                    stack.push(i);
                }
            }
        }

        for (int i = 0; i < location.length; i++) {
            if(location[i]==1){
                tmpNum += 1;
                retNum = retNum<tmpNum?tmpNum:retNum;
            }else{
                tmpNum = 0;
            }
        }
        return retNum;
    }

    @Test
    public void test() {
        System.out.println(longestValidParentheses("(()())"));
    }

}
