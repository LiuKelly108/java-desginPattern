package com.kellystudy.pattern.decorate.battercake;

public class BaseBattercake extends Battercake {


    @Override
    protected String getName() {
        return "煎饼";
    }

    @Override
    protected int getPrince() {
        return 5;
    }
}
