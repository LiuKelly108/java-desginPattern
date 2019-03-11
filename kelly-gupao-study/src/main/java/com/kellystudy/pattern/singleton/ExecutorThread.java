package com.kellystudy.pattern.singleton;

import com.kellystudy.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.kellystudy.pattern.singleton.lazy.LazySingleton;

public class ExecutorThread  implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton  =  LazySingleton.getInstance();
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(System.currentTimeMillis()+":");
        System.out.println(Thread.currentThread().getName()+"—>"+lazy);
    }
}
