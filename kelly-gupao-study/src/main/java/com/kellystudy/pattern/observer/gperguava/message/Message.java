package com.kellystudy.pattern.observer.gperguava.message;

import com.google.common.eventbus.EventBus;

public abstract class Message {

    private  String name ;
    private  String msg ;
    private EventBus  eventBus = new EventBus() ;

    public Message(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public EventBus getEventBus() {
        return eventBus;
    }
}
