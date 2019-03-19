package com.kellystudy.pattern.observer.jdk;

public class GPerTest {

    public static void main(String[] args) {

        GPer gper =  GPer.getInstance();

        Teacher  t1 = new Teacher("小媛儿");
        Teacher  t2 = new Teacher("小美");

        //@老师
        gper.addObserver(t1);
        gper.addObserver(t2);
        //问题
        Question  question = new Question();
        question.setUsername("小龙儿");
        question.setContent("我是谁？我从哪里来？我要到哪里去？我要做什么？");
        //发布问题
        gper.publishQuestion(question);

    }
}
