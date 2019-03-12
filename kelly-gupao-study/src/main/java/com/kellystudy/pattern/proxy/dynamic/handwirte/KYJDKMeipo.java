package com.kellystudy.pattern.proxy.dynamic.handwirte;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class KYJDKMeipo implements KYInvocationHandler {

    private Object target ;  //被代理对象的引用


    public KYJDKMeipo(Object target){
        this.target=target ;
    }

    public Object getInstance() throws Exception{
        Class<?> clazz = target.getClass();

        return  KYProxy.newProxyInstance(new KYClassLoader(),clazz.getInterfaces(),this);

    }

    /*调用代理的方法*/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法调用前
        before();
        //调用方法:Person接口的方法
        Object obj =  method.invoke(this.target,args);
        //方法调用后处理
        after();
        return obj;
    }

    private void before(){
        System.out.println("------调用前的准备工作------");
    }
    private void after(){
        System.out.println("------调用后的处理工作------");
    }
}
