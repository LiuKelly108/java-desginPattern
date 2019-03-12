package com.kellystudy.pattern.proxy.dynamic.jdk;

import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Person;
import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Son;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) {
        try {
//              JDKMeipo p= new JDKMeipo(new Son());
//            Object obj = p.getInstance();
//            Method method  = obj.getClass().getMethod("findLove",null);
//            method.invoke(obj);
//            System.out.println(p.i);

           Person person = (Person) new JDKMeipo(new Son()).getInstance();
           person.findLove();
           //******************************通过反编译工具查看源码*********************
            byte[] data =  ProxyGenerator
                    .generateProxyClass("$Proxy0",new Class<?>[]{Person.class});
            FileOutputStream fos =new FileOutputStream("E:\\ideaWorkspace\\kelly-study\\kelly-gupao-study\\$Proxy0.class");
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
