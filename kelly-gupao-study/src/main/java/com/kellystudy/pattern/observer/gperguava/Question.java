package com.kellystudy.pattern.observer.gperguava;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String username ; //提问人
    private String content ;  //提问内容
    private List<Teacher> teachersList = new ArrayList<Teacher>(); //@解答问题的老师

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
}
