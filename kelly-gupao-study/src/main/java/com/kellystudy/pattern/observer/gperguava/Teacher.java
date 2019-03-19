package com.kellystudy.pattern.observer.gperguava;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private  String name ;

    public Teacher(String name) {
        this.name = name;
    }

    /**
     * 老师收到问题的通知
     * @param question
     */
    @Subscribe
    public  void  getNotice(Question  question){
        System.out.println("==========老师收到通知==================");
        System.out.println(this.name+"老师，您好！你有一个问题待解决: \n "+"提问者" +
                "："+question.getUsername()+",内容是："+question.getContent() );
    }
}
