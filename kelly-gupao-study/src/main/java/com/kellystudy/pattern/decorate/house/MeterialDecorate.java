package com.kellystudy.pattern.decorate.house;

public  abstract  class  MeterialDecorate extends  HouseDecorate {

    protected   HouseDecorate  houseDecorate ;

    public MeterialDecorate(HouseDecorate houseDecorate) {
        this.houseDecorate = houseDecorate;
    }

    abstract void doDecorate() ;
}
