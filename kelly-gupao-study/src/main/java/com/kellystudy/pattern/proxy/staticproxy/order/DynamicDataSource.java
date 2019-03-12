package com.kellystudy.pattern.proxy.staticproxy.order;

public class DynamicDataSource {

    //默认数据源
    private  final static String DEFAULT_SOURCE = null ;
    private  final static ThreadLocal<String> local = new ThreadLocal<String>();
    private  DynamicDataSource(){}

    //清空数据源
    public static void clearSource(){
        local.remove();
    }
    //获取当前正在使用的数据源名字
    public  static  String get(){
        return local.get();
    }
    //还原当前切面的数据源
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }
    //设置已知名字的数据源
    public static void set(String dataSource){
        local.set(dataSource);
    }
    //根据年份动态设置数据源
    public static void set(int year){
        System.out.println("----准备切换数据库---DB:"+year);
        local.set("DB_"+year);

    }
}
