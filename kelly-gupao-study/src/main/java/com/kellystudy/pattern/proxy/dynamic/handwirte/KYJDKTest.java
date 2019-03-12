package com.kellystudy.pattern.proxy.dynamic.handwirte;

import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Person;
import com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker.Son;

public class KYJDKTest {

    public static void main(String[] args) throws Exception {
       Person person = (Person) new KYJDKMeipo(new Son()).getInstance();
       person.findLove();
    }
}
