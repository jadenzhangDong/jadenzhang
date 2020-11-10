package com.example.demo.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        //创建map，用于出去重复单词
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            map.putIfAbsent(words[i],i);
        }

        //按照kap对应关系更换掉字符串
        String curs = s;
        for (String str : map.keySet()) {

            curs = curs.replaceAll(str, String.valueOf(map.get(str)));
        }
        //遍历字符串，比对是否符合要求，并记录位置
        int location = 0;
        int index = 0;
        int wordLegth = words[0].length();
        List<Integer> returnLocation = new ArrayList<>();
        int[] curInts = createArray(map, words);
        //计数器
        int sum = 0;
        for (int i = 0; i < curInts.length; i++) {
            sum += curInts[i];
        }
        int changeSum = sum;
        for(int i=0; i<curs.length(); i++){
            //判断是否是是在数组中的单词
            int a = curs.charAt(i)-'0';
            if(map.containsValue(a)){
                //每次遍历去校验一遍是否比对完成
                //判断是否符合curInts中的剩余单词
                if(curInts[a]!=0){
                    curInts[a]--;
                    changeSum--;
                    if(changeSum==0){
                        returnLocation.add(location);
                        //重置计数器，数组
                        changeSum = sum;
                        curInts = createArray(map, words);
                        location = index+wordLegth;
                    }
                }else{
                    //重置计数器，数组
                    changeSum = sum;
                    curInts = createArray(map, words);
                    location = index+wordLegth;
                }
                index+=wordLegth;
            }else{
                if(changeSum != sum){
                    //重置计数器，数组
                    changeSum = sum;
                    curInts = createArray(map, words);
                }
                index+=1;
                location+=1;
            }
        }
        return returnLocation;
    }

    private int[] createArray(Map<String, Integer> map, String[] words){
        int[] ints = new int[map.size()];
        for(int i=0; i<words.length; i++){
            ints[map.get(words[i])]++;
        }
        return ints;
    }


    @Test
    public void test(){
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};
        List<Integer> substring = findSubstring(s, words);
        System.out.println(substring.toString());
    }
}
