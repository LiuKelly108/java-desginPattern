package com.kellystudy.pattern.decorate.battercake;

public class EggDecorate extends BattercakeDecorate {

    public EggDecorate(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getName() {
        return super.getName()+"鸡蛋";
    }

    @Override
    protected int getPrince() {
        return super.getPrince()+1;
    }
}
