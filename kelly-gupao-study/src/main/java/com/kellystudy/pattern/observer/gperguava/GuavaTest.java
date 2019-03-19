package com.kellystudy.pattern.observer.gperguava;

import com.kellystudy.pattern.observer.gperguava.dispather.GPerDispatcher;
import com.kellystudy.pattern.observer.gperguava.message.Information;
import com.kellystudy.pattern.observer.gperguava.message.Message;
import com.kellystudy.pattern.observer.gperguava.message.Question;
import com.kellystudy.pattern.observer.gperguava.observer.AObserver;
import com.kellystudy.pattern.observer.gperguava.observer.StudentObserver;
import com.kellystudy.pattern.observer.gperguava.observer.TeacherObserver;
import com.kellystudy.pattern.observer.gperguava.subject.GPerQuestion;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class GuavaTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        //******提问题********又提问者指定具体的作答人员
        List<AObserver> questionObser = new ArrayList<AObserver>();
        questionObser.add(new TeacherObserver("Tom"));
        questionObser.add(new StudentObserver("小雪儿"));
        Message msg = new Question("小龙儿","我是谁？我从那儿来？将要去哪里？",questionObser);

        GPerDispatcher dispatcher = new GPerDispatcher();
        dispatcher.doDispatcher(msg);
        //******平台发广播
        Message message = new Information("咕泡平台","注意：取消今天晚上8点的课程安排，请知悉！");
        dispatcher.doDispatcher(message);

    }
}
