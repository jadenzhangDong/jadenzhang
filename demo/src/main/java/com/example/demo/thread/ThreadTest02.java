package com.example.demo.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.*;

public class ThreadTest02 extends Thread {
    private int shuliang = 100;

    @Override
    public void run() {
        synchronized (ThreadTest02.class) {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "线程执行了" + shuliang);
                shuliang--;
                if (shuliang <= 0) {
                    break;
                }
            }
        }
    }
}

class test{


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadTest02 threadTest02 = new ThreadTest02();
//        new Thread(threadTest02).start();
//
//        new Thread(threadTest02).start();
        test1 test1 = new test1();
        test2 test2 = new test2();
//        FutureTask ft = new FutureTask(test1);
//        Future<String> stringFuture = new Future<String>();

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future submit = executorService.submit(test1);
//        executorService.submit(test1, submit);
        Future<Class<String>> submit1 = executorService.submit(test2, String.class);
        System.out.println(submit1.toString());
//        String o = (String)submit.get();
//        System.out.println(o);
        executorService.shutdown();
    }
}

class test1 implements Callable{

    @Override
    public Object call() throws Exception {
        return "hahah";
    }
}

class test2 implements Runnable{

    @Override
    public void run(){
        System.out.println("test2"+Thread.currentThread().getName()+"hahhahah");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
//        test2 test2 = new test2();
//        ArrayBlockingQueue<Runnable> objects = new ArrayBlockingQueue<Runnable>(8);
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 0,
//                TimeUnit.NANOSECONDS, objects,new ThreadPoolExecutor.DiscardOldestPolicy());
//
//
//
//
//        for (int i=0;i<=10;i++){
//            threadPoolExecutor.execute(test2);
//        }
//
//        threadPoolExecutor.shutdown();
        Executors.newCachedThreadPool().submit(new test1());
        Executors.newCachedThreadPool().submit(new test2());
        Executors.newCachedThreadPool().execute(new test2());

        Executors.newFixedThreadPool(1111).submit(new test1());

        Executors.newSingleThreadExecutor().submit(new test2());
    }
}

class scheduleThreadTest{
    /**
     * 线程安全的队列
     */
    static Queue<String> queue = new ConcurrentLinkedQueue<String>();

    static {
        //入队列
        for (int i = 0; i < 9; i++) {
            queue.add("task-" + i);
        }
    }
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < queue.size(); i++) {
            ScheduledFuture<String> scheduledFuture = executorService.schedule(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    String value = queue.poll();
                    if (value != "" && null != value) {
                        System.out.println("时间:" + sdf.format(new Date()) + "线程" + Thread.currentThread().getName() + " 执行了task: " + value);
                    }
                    return "call";
                }
            }, 3, TimeUnit.SECONDS);

            System.out.println(scheduledFuture.get());
        }

        executorService.shutdown();

    }
}