package com.kellystudy.pattern.decorate.battercake;

public class SausageDecorate extends BattercakeDecorate {

    public SausageDecorate(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getName() {
        return super.getName()+"香肠";
    }

    @Override
    protected int getPrince() {
        return super.getPrince()+2;
    }
}
