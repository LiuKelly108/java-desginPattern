package com.kellystudy.pattern.observer.gperguava.observer;

import com.kellystudy.pattern.observer.gperguava.message.Message;
import com.kellystudy.pattern.observer.gperguava.message.Question;

public class TeacherObserver extends AObserver {

    public TeacherObserver(String name) {
        super(name);
    }

    @Override
    void getQuestion(Question msg) {
        System.out.println(super.getName()+"老师，您好！您有一个待解决问题！提问者："+msg.getName()+",问题描述："+msg.getMsg());
    }

}
