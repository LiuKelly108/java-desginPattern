package com.kellystudy.pattern.singleton.threadlocal;

import com.kellystudy.pattern.singleton.ExecutorThread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(System.currentTimeMillis()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(System.currentTimeMillis()+":"+ThreadLocalSingleton.getInstance());
        System.out.println(System.currentTimeMillis()+":"+ThreadLocalSingleton.getInstance());

        Thread  t = new Thread(new ExecutorThread()){
            @Override
            public void run() {
                ThreadLocalSingleton s1= ThreadLocalSingleton.getInstance();
                ThreadLocalSingleton s2= ThreadLocalSingleton.getInstance();
                System.out.println(currentThread().getName()+":"+s1);
                System.out.println(currentThread().getName()+":"+s2);
            }
        };

        Thread  t2 = new Thread(new ExecutorThread()){
            @Override
            public void run() {
                ThreadLocalSingleton s1= ThreadLocalSingleton.getInstance();
                ThreadLocalSingleton s2= ThreadLocalSingleton.getInstance();
                System.out.println(currentThread().getName()+":"+s1);
                System.out.println(currentThread().getName()+":"+s2);
            }
        };

        t.start();
        t2.start();
    }
}
