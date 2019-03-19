package com.kellystudy.pattern.observer.gperguava;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String username ; //提问人
    private String content ;  //提问内容
    private List<Teacher> teachersList = new ArrayList<Teacher>(); //希望解答该问题的老师

    public Question(String username, String content, List<Teacher> teachersList) {
        this.username = username;
        this.content = content;
        this.teachersList = teachersList;
    }

    private EventBus eventBus = new EventBus() ;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Teacher> getTeachersList() {
        return teachersList;
    }

    public void setList(List<Teacher> list) {
        this.teachersList = list;
    }



    //问题绑定监听
    public  final  void  addBindEventBus(){
        //注册问题
        List<Teacher> teachersList = this.getTeachersList();
        if(teachersList.size()>0){
            for(Teacher teacher : teachersList){
                eventBus.register(teacher);
            }
            eventBus.post(this);
        }
    }

    //去掉监听绑定
    public final void removeEventBus(){
        List<Teacher> teachersList = this.getTeachersList();
        if(teachersList.size()>0){
            for(Teacher teacher : teachersList){
                eventBus.unregister(teacher);
            }
        }
    }
}
