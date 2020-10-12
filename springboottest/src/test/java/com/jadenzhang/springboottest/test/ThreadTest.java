package com.jadenzhang.springboottest.test;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;

public class ThreadTest extends Thread implements BeanFactoryAware, ApplicationContextAware {
    @SneakyThrows
    @Override
    public void run() {
            System.out.println("我进来了，哈哈哈哈");
            Thread.sleep(1000);
//            return "哈哈";

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTest threadTest = new ThreadTest();
//        FutureTask<String> task = new FutureTask<>(threadTest);

        threadTest.start();
        threadTest.join();
        System.out.println("我执行了");

        //String result = task.get();
        //System.out.println(result);

        new Semaphore(5);


//        Arrays.sort(new int[], new Comparable(){
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        });




    }
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}

class ThreadTest1 {
}