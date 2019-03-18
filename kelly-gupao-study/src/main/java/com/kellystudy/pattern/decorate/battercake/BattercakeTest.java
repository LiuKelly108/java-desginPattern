package com.kellystudy.pattern.decorate.battercake;

public class BattercakeTest {

    public static void main(String[] args) {

        Battercake  battercake = new BaseBattercake();
        battercake = new EggDecorate(battercake);
        battercake = new SausageDecorate(battercake);
        System.out.println( battercake.getName()+",总价是："+battercake.getPrince());


    }
}
