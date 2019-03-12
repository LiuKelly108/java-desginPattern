package com.kellystudy.pattern.proxy.staticproxy.womanmatchmaker;

/**
 * 父亲扮演着代理的角色，为儿子找对象
 */
public class Father implements Person {

    private  Son  person ;

    public Father(Son person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("-----父亲物色对象------");
        person.findLove();
        System.out.println("-----找到了后，双方请确立关系把----");
    }
}
