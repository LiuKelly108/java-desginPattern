package com.kellystudy.pattern.observer.gperguava.message;

import com.kellystudy.pattern.observer.gperguava.observer.AObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 由提问者选择要发通知的人
 */
public class Question  extends  Message {

    private List<AObserver> observerList = new ArrayList<AObserver>();

    public Question(String name, String msg, List<AObserver> observerList) {
        super(name, msg);
        this.observerList = observerList;
    }

    public List<AObserver> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<AObserver> observerList) {
        this.observerList = observerList;
    }

    public Question(String name, String msg) {
        super(name, msg);
    }
}
