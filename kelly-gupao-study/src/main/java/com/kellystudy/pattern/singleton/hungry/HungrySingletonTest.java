package com.kellystudy.pattern.singleton.hungry;

public class HungrySingletonTest {

    public static void main(String[] args) {

        HungrySingleton hungrySingleton0 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton3 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton4 = HungrySingleton.getInstance();
        System.out.println(System.currentTimeMillis()+"：hungrySingleton—>"+hungrySingleton0);
        System.out.println(System.currentTimeMillis()+"：hungrySingleton—>"+hungrySingleton1);
        System.out.println(System.currentTimeMillis()+"：hungrySingleton—>"+hungrySingleton2);
        System.out.println(System.currentTimeMillis()+"：hungrySingleton—>"+hungrySingleton3);
        System.out.println(System.currentTimeMillis()+"：hungrySingleton—>"+hungrySingleton4);

        HungryStaticSingleton hungryStaticSingleton0 =HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton1 =HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton2 =HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton3 =HungryStaticSingleton.getInstance();
        HungryStaticSingleton hungryStaticSingleton4 =HungryStaticSingleton.getInstance();

        System.out.println(System.currentTimeMillis()+"：hungryStaticSingleton—>"+hungryStaticSingleton0);
        System.out.println(System.currentTimeMillis()+"：hungryStaticSingleton—>"+hungryStaticSingleton1);
        System.out.println(System.currentTimeMillis()+"：hungryStaticSingleton—>"+hungryStaticSingleton2);
        System.out.println(System.currentTimeMillis()+"：hungryStaticSingleton—>"+hungryStaticSingleton3);
        System.out.println(System.currentTimeMillis()+"：hungryStaticSingleton—>"+hungryStaticSingleton4);


    }
}
