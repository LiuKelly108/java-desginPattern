package com.kellystudy.pattern.prototype.deep;

import com.kellystudy.pattern.prototype.shallow.ConcreteProtoType;

import java.util.ArrayList;
import java.util.List;

public class DeepCloneTest {

    public static void main(String[] args) {

        List<String> list =new ArrayList<String>();
        list.add("看书");
        list.add("养小猫");
        list.add("溜狗狗");
        DeepConcretePrototype dcpt = new DeepConcretePrototype("小龙儿",18 ,list);
        DeepConcretePrototype dcpt1 =  dcpt.clone();

        System.out.println(dcpt+":"+dcpt.getAge()+","+dcpt.getName()+","+dcpt.getHobbies());
        System.out.println(dcpt1+":"+dcpt1.getAge()+","+dcpt1.getName()+","+dcpt1.getHobbies());
        //打印false，原型的引用与克隆对象的引用地址不一致
        System.out.println(dcpt.getHobbies() == dcpt1.getHobbies());

    }
}
