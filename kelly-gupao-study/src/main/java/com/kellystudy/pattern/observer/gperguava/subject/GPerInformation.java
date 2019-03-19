package com.kellystudy.pattern.observer.gperguava.subject;

import com.google.common.eventbus.EventBus;
import com.kellystudy.pattern.observer.gperguava.message.Information;
import com.kellystudy.pattern.observer.gperguava.observer.AObserver;
import com.kellystudy.pattern.observer.gperguava.observer.TeacherObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 广播发布信息
 */
public class GPerInformation implements AGPer {

    private static List<AObserver> observers = new ArrayList<AObserver>();
    private static GPerInformation gPerInformation = null ;

    static {
        observers.add(new TeacherObserver("Tom"));
        observers.add(new TeacherObserver("小龙儿"));
        observers.add(new TeacherObserver("小水儿"));
    }

    private GPerInformation(){}

    /**
     * 创建实例
     * @return
     */
    public static GPerInformation getInstance(){
        if( null == gPerInformation){
            gPerInformation = new GPerInformation();
        }
        return  gPerInformation;
    }

    @Override
    public void publishMsg(Object  msg) {
        System.out.println("------发布广播-----");
        EventBus bus = ((Information)msg).getEventBus();
        for(AObserver observer : observers){
            bus.register(observer);
        }
        bus.post(msg);
    }
}
