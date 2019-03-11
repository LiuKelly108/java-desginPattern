package com.kellystudy.pattern.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class ShallowProtoTypeTest {

    public static void main(String[] args) {

        List<String> list =new ArrayList<String>();
        list.add("看书");
        list.add("养小猫");
        list.add("溜狗狗");
        ConcreteProtoType  cpt = new ConcreteProtoType("小龙儿",18 ,list);
        ConcreteProtoType  cpt1 = cpt.clone();
        System.out.println(cpt+":"+cpt.getAge()+","+cpt.getName()+","+cpt.getHobbies());
        System.out.println(cpt1+":"+cpt1.getAge()+","+cpt1.getName()+","+cpt1.getHobbies());
        //打印true，原型的引用与克隆对象的引用地址一致
        System.out.println(cpt.getHobbies() == cpt1.getHobbies());
    }
}
