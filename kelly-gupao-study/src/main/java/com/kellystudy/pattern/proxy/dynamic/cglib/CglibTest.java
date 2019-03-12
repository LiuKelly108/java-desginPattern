package com.kellystudy.pattern.proxy.dynamic.cglib;

import java.lang.reflect.Method;

public class CglibTest {

    public static void main(String[] args) {
        CglibMeipoProxy  cmp= new CglibMeipoProxy(new Girl() );
        try {
             Girl obj =(Girl) cmp.getInstance();
//             Method m = obj.getClass().getMethod("findLove",null);
//             m.invoke(obj);
              obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
