package com.kellystudy.pattern.prototype.shallow;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ConcreteProtoType implements ProtoType{

    private String name ;
    private int age ;
    private List<String> hobbies = new ArrayList<String>();

    public ConcreteProtoType() {}

    public ConcreteProtoType(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    //克隆ConCreteProtoType原型
    public ConcreteProtoType  clone() {

        ConcreteProtoType  cpt = new ConcreteProtoType();
        Class<?> clazz = cpt.getClass();
        Method[]  methods = clazz.getDeclaredMethods();
        for(Method m:methods)
            if (m.getName().startsWith("set")) {
                //获得set的成员变量的名字
                String param = m.getName().replace("set", "").toLowerCase();
                System.out.println("----设置参数值：--" + param);
                try {
                    m.setAccessible(true);
                    //获得原型对象的对应的成员变量
                    Field field = this.getClass().getDeclaredField(param);
                    m.invoke(cpt, field.get(this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        return cpt;
    }
}
