package com.kellystudy.pattern.observer.gperguava.observer;

import com.kellystudy.pattern.observer.gperguava.message.Message;
import com.kellystudy.pattern.observer.gperguava.message.Question;

public class StudentObserver extends AObserver {


    public StudentObserver(String name) {
        super(name);
    }

    @Override
    void getQuestion(Question msg) {
        System.out.println(super.getName()+"同学，您好！"+msg.getName()+"向你求助:" +msg.getMsg());
    }
}
