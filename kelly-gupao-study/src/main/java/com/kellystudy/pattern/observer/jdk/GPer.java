package com.kellystudy.pattern.observer.jdk;

import java.util.Observable;

/**
 * jdk 提供的一种观察者模式
 * GPer是被观察的主体
 */
public class GPer extends Observable {

    private  String name = "咕泡生态圈";
    private  static  GPer gper = null ;

    private GPer(){}

    /**
     * 获得实例
     * @return
     */
    public static GPer getInstance(){
        if ( null == gper){
            gper = new GPer();
        }
        return  gper ;
    }

    public String getName() {
        return name;
    }

    /**
     * 发布方法
     */
    public  void publishQuestion(Question question){
        System.out.println(question.getUsername()+"在"+this.name+"上，提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
