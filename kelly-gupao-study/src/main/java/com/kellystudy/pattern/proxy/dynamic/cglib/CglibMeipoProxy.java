package com.kellystudy.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理
 */
public class CglibMeipoProxy implements MethodInterceptor {

    private Object target ;

    public CglibMeipoProxy(Object target){
        this.target = target ;
    }

    /*创建代理对象*/
    public  Object  getInstance(){
        Enhancer  enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(target.getClass());
        //设置回调
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /*调用方法*/
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();

        Object obj = methodProxy.invokeSuper(o ,objects);

        after();

        return obj;
    }

    private void before(){
        System.out.println("-----操作前的准备-----");
    }
    private void after(){
        System.out.println("-----操作后的准备-----");
    }
}
