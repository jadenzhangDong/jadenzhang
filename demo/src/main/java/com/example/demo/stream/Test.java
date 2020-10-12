package com.example.demo.stream;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        List<Object> list9 = new ArrayList<Object>();
//        for (int i = 1; i < 4; i++) {
////            User user = new User(i, "pancm" + i);
////            list9.add(user);
//        }
//        System.out.println("截取之前的数据:");
        // 取前3条数据，但是扔掉了前面的2条，可以理解为拿到的数据为 2<=i<3 (i 是数值下标)
//        List<String> list10 = list9.stream().map(User::getPassword).limit(3).skip(2).collect(Collectors.toList());
//        System.out.println("截取之后的数据:" + list10);

        switch (1){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
                break;
        }


    }
}
