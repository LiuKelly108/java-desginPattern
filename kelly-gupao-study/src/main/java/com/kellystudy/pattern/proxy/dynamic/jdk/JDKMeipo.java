package com.kellystudy.pattern.proxy.dynamic.jdk;

import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理：需要实现InvocationHandler
 */
public class JDKMeipo implements InvocationHandler {

    private Object target ;  //被代理对象的引用
    public   static  volatile int i =0;

    public JDKMeipo(Object target){
        this.target=target ;
    }

    public Object getInstance() throws Exception{
        Class<?> clazz = target.getClass();
        i++;
        return  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

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
        i++;
        System.out.println("------调用前的准备工作------");
    }
    private void after(){
        i++;
        System.out.println("------调用后的处理工作------");
    }
}
