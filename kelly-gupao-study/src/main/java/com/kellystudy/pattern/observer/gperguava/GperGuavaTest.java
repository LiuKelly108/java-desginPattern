package com.kellystudy.pattern.observer.gperguava;

import java.util.ArrayList;
import java.util.List;

public class GperGuavaTest {

    public static void main(String[] args) {

        GPer gper =  GPer.getInstance();

        //小龙儿同学提交一个问题
        String content1="我是谁？我从哪儿来？我要去哪儿？";
        List<Teacher> list = new ArrayList<Teacher>();
        list.add(new Teacher("帅气的Tom"));
        list.add(new Teacher("霸气的mic"));
        Question question = new Question("小龙儿",content1,list);
       //提交问题1
        gper.commitQuestion(question);

        //小水儿同学提交一个问题
        List<Teacher> list2 = new ArrayList<Teacher>();
        list2.add(new Teacher("小米"));
        Question q2 = new Question("小水儿","魔镜魔镜，谁是世界上最美丽的女人？" ,list2);
        //提交问题2
        gper.commitQuestion(q2);
    }
}
