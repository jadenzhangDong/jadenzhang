package com.example.demo.thread;

import java.util.concurrent.Callable;

/**
 *
 */
class CreateThread01 extends Thread{


    @Override
    public void run() {
        getId();
        System.out.println("1234");
    }
}
class CreateThread02 implements Runnable{

    @Override
    public void run() {

    }
}
class CreateThread03 implements Callable {


    @Override
    public Object call() throws Exception {
        return "qwe";
    }
}
public class ThreadTest01{
    public static void main(String[] args) throws Exception {
        CreateThread01 t1 = new CreateThread01();
        t1.start();
        Thread hahahah = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hahahah");
            }
        });
        hahahah.start();
        Callable createThread03 = new CreateThread03();
        createThread03.call();
    }



}
