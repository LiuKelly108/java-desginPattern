package com.kellystudy.pattern.singleton.lazy;

/**
 * 内部类的懒汉式写法
 */
public class LazyInnerClassSingleton {

    private  LazyInnerClassSingleton(){}

    //获得实例;final保证方法不被重写
    public static final LazyInnerClassSingleton getInstance(){
        return  LazyHolder.LAZY ;
    }

    //静态内容类
   private  static  class LazyHolder {
     private  static  final  LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton() ;

    }
}
