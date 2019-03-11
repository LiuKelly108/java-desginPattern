package com.kellystudy.pattern.singleton.hungry;

import java.io.Serializable;

public class SerializableHungrySingleton implements Serializable {

    private static final long serialVersionUID = 3506249421806200133L;

    private  static final SerializableHungrySingleton seri_hunryg_singleton =new SerializableHungrySingleton() ;

    private SerializableHungrySingleton(){}

    public static  SerializableHungrySingleton getInstance(){
        return seri_hunryg_singleton ;
    }

    //添加readResovle() ，避免序列化、反序列化破坏单例(实际上实例还是初始化了多次，消耗内存)
    private Object readResolve(){
        return seri_hunryg_singleton ;
    }

}
