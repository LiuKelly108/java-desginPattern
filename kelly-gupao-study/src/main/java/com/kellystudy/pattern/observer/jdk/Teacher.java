package com.kellystudy.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String name ;//老师姓名


    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer  gper = (GPer)o ;
        Question question =(Question)arg ;
        System.out.println("==============================");
        System.out.println(this.name+"老师，您好！\n"+"您收到了一个来自"+gper.getName()+"的一个问题。" +
                "问题内容是："+question.getContent()+"。提问者是："+question.getUsername()+"\n");

    }
}
