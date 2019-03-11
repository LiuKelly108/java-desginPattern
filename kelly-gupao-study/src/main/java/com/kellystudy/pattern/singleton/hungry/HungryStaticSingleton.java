package com.kellystudy.pattern.singleton.hungry;

/**
 * 饿汉式静态代码
 */
public class HungryStaticSingleton {

    private  static   HungryStaticSingleton hungryStaticSingleton ;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public  static  HungryStaticSingleton getInstance(){
        return  hungryStaticSingleton ;
    }
}
