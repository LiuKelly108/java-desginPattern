package com.kellystudy.pattern.singleton.lazy;

/**
 * 2、懒汉式：在对象被调用的时候，才会实例化
 */
public class LazySingleton {

    private  static LazySingleton lazySingleton = null ;
    private LazySingleton(){
        if(lazySingleton !=null ){
            throw  new  RuntimeException("不允许通过反射创建实例");
        }
    }

    /* Double-check 写法 : 线程安全  */
    public static  LazySingleton getInstance(){
        if (lazySingleton == null ){
            synchronized (LazySingleton.class){
                 if(lazySingleton == null){
                     lazySingleton = new LazySingleton();
                 }
            }
        }
        return  lazySingleton;
    }
}
