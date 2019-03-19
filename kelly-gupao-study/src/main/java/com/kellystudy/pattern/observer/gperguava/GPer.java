package com.kellystudy.pattern.observer.gperguava;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class GPer {

    private String name = "咕泡生态圈" ;
    private static GPer gper = null ;
    private List<Question> list = new ArrayList<Question>(); //存放问题的容器
    private  EventBus eventBus ; //事件监听,一个问题，绑定一个eventBus

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
        addBindEventBus(question);
    }

    //添加eventbus的绑定
    private  void  addBindEventBus(Question question){
        //经过测试，eventBus不能作为Gper共享的单例，应当一个问题绑定一个eventBus
         eventBus = new EventBus();
        //注册问题
        List<Teacher> teachersList = question.getTeachersList();
        if(teachersList.size()>0){
            for(Teacher teacher : teachersList){
                eventBus.register(teacher);
            }
            eventBus.post(question);
        }
    }

}
