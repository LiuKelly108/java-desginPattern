package com.kellystudy.pattern.decorate.house;

public class FloorDecorate extends MeterialDecorate {


    public FloorDecorate(HouseDecorate houseDecorate) {
        super(houseDecorate);
    }

    @Override
    void doDecorate() {
        super.houseDecorate.doDecorate();
        System.out.println("铺地板砖");
    }
}
