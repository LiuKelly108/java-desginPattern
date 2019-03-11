package com.kellystudy.pattern.singleton.register;
public  enum  EnumSingleton{

    INSTANCE ;

    private  Object  enumSingleton ;

    /*枚举的构造方法只执行一次*/
    private EnumSingleton(){
        System.out.println("-----init------");
        enumSingleton=new Object();
    }

    public Object getData(){
        return enumSingleton ;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE ;
    }

    }

