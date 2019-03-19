package com.kellystudy.pattern.observer.gperguava;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class GPer {

    private String name = "咕泡生态圈" ;
    private static GPer gper = null ;
    private List<Question> list = new ArrayList<Question>(); //存放已提交问题的容器

    private GPer(){}

    /**
     * 创建GPer的实例
     * @return
     */
    public static  GPer getInstance(){
        if( null == gper){
            gper = new GPer() ;
        }
        return  gper ;
    }

    //提交问题
    public void commitQuestion(Question  question){
        //提交问题
        list.add(question);
        System.out.println("***************一个新问题提交成功*************");
        System.out.println(question.getUsername()+"同学在"+this.name+"上，提交了一个问题！");
        this.notifyEventBus(question);
    }

    //唤起检测者
    private void notifyEventBus(Question question){
        question.addBindEventBus();
    }

}
