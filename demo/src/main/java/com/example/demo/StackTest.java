package com.example.demo;

import java.sql.Driver;
import java.util.ServiceLoader;
import java.util.concurrent.ThreadPoolExecutor;

public class StackTest {
    private static int a= 3;
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {

        int i = 2 + 3;
        System.out.println("线程睡眠一会ZZZZZZZ");
        Thread.sleep(10000);
        System.out.println("线程醒了");

        Class.forName("com.mysql.jdbc.Driver");






    }
}
