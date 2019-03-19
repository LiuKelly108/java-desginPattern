package com.kellystudy.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent guavaEvent1 = new GuavaEvent();

    //    eventBus.register(guavaEvent);
        eventBus.register(guavaEvent1);
        eventBus.post("Tom");
       // eventBus.post("ss");

    }
}
