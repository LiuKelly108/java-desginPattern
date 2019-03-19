package com.kellystudy.pattern.observer.gperguava.subject;

import com.google.common.eventbus.EventBus;
import com.kellystudy.pattern.observer.gperguava.message.Question;
import com.kellystudy.pattern.observer.gperguava.observer.AObserver;

import java.util.*;

public class GPerQuestion implements AGPer{

    private List<AObserver> observers = new ArrayList<AObserver>();
    private static GPerQuestion gPerQuestion = null ;

    private GPerQuestion() {}

    public static GPerQuestion getInstance(){
        if( null == gPerQuestion){
            gPerQuestion =new GPerQuestion();
        }
        return  gPerQuestion ;
    }

    public void publishMsg(Object question) {
        System.out.println("有一个新问题被提交：");
        //发送通知给相关人员
        Question q = (Question)question ;
        observers =q.getObserverList();
        EventBus bus = q.getEventBus();
        for(AObserver observer : observers){
            bus.register(observer);
        }
         bus.post(question);
    }
}
