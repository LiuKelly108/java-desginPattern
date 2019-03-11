package com.kellystudy.pattern.singleton.destroySingleton;

import com.kellystudy.pattern.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 破坏单例模式：
 *  1、使用反射进行破坏
 */
public class RefDestroySingletonTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
    //1.正常获得实例对象 lazySingleton
     LazySingleton lazySingleton =  LazySingleton.getInstance();
     //2、使用反射创建实例对象
     Class<?> clazz =  LazySingleton.class;
     //获得构造方法
     Constructor<?> c =clazz.getDeclaredConstructor(null);
     //设置权限,强制访问
     c.setAccessible(true);
     //创建实例对象 obj
     Object obj = c.newInstance();
     //***************************打印这2个实例对象*******************
     System.out.println(lazySingleton);
     System.out.println(obj);

    }
}
