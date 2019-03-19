package com.kellystudy.pattern.observer.gperguava.observer;

import com.google.common.eventbus.Subscribe;
import com.kellystudy.pattern.observer.gperguava.message.Information;
import com.kellystudy.pattern.observer.gperguava.message.Message;
import com.kellystudy.pattern.observer.gperguava.message.Question;
import com.kellystudy.pattern.observer.gperguava.subject.AGPer;

public abstract  class AObserver {

    private  String  name ;

    public AObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //获得通知
    @Subscribe
    abstract  void  getQuestion(Question msg) ;

    @Subscribe
     void  getNote(Information msg){
        System.out.println(this.name+"，您好！"+msg.getName()+"发布了一条广播:"+msg.getMsg());
    }

}
