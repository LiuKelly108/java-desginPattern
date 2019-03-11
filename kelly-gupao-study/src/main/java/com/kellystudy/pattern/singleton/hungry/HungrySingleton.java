package com.kellystudy.pattern.singleton.hungry;

/**
 * 1、饿汉式单例：在首次加载的时候就创建实例
 */
public  class HungrySingleton {

    private static final  HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static  HungrySingleton getInstance(){
        return   hungrySingleton ;
    }
}
