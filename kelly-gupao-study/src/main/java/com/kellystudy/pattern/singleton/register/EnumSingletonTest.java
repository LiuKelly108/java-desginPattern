package com.kellystudy.pattern.singleton.register;

public class EnumSingletonTest {

    public static void main(String[] args) {
        Object obj = EnumSingleton.getInstance().getData();
        System.out.println(obj);

        Object obj1 = EnumSingleton.getInstance().getData();
        System.out.println(obj1);

        Object obj2 = EnumSingleton.getInstance().getData();
        System.out.println(obj2);
    }
}
