package com.kellystudy.pattern.decorate.battercake;

public  abstract  class BattercakeDecorate extends Battercake {

    private  Battercake  battercake ;

    public BattercakeDecorate(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getName() {
        return this.battercake.getName();
    }

    @Override
    protected int getPrince() {
        return this.battercake.getPrince();
    }
}
