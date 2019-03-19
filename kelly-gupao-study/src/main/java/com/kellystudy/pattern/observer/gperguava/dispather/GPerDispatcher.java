package com.kellystudy.pattern.observer.gperguava.dispather;

import com.kellystudy.pattern.observer.gperguava.message.Information;
import com.kellystudy.pattern.observer.gperguava.message.Message;
import com.kellystudy.pattern.observer.gperguava.message.Question;
import com.kellystudy.pattern.observer.gperguava.observer.AObserver;
import com.kellystudy.pattern.observer.gperguava.subject.AGPer;
import com.kellystudy.pattern.observer.gperguava.subject.GPerInformation;
import com.kellystudy.pattern.observer.gperguava.subject.GPerQuestion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GPerDispatcher {

    private static Map<Class<?extends Message>, Object> mapMsg = new HashMap<Class<? extends Message>, Object>();

    static {

            try {
                 mapMsg.put(Question.class, GPerQuestion.getInstance());
                 mapMsg.put(Information.class, GPerInformation.getInstance());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 委派
     public void  doDispatcher(Message msg) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object obj =  mapMsg.get(msg.getClass());
        Method method = obj.getClass().getMethod("publishMsg",Object.class);
        method.invoke(obj,msg);
    }



}
