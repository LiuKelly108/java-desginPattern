package com.kellystudy.pattern.observer.gperguava;

import java.util.ArrayList;
import java.util.List;

public class GperGuavaTest {

    public static void main(String[] args) {

        GPer gper =  GPer.getInstance();

        //小龙儿同学提交一个问题
       Question question = new Question();
       question.setUsername("小龙儿");
       question.setContent("我是谁？我从哪儿来？我要去哪儿？");
       List<Teacher> list = new ArrayList<Teacher>();
       list.add(new Teacher("帅气的Tom"));
       list.add(new Teacher("霸气的mic"));
       question.setList(list);
       //提交问题1
        gper.commitQuestion(question);

        //小水儿同学提交一个问题
        Question question2 = new Question();
        question2.setUsername("小水儿");
        question2.setContent("魔镜魔镜，谁是世界上最美丽的女人？");
        List<Teacher> list2 = new ArrayList<Teacher>();
        list2.add(new Teacher("小米"));
        question2.setList(list2);
        //提交问题2
        gper.commitQuestion(question2);
    }
}
