package com.kellystudy.pattern.decorate.house;

public class WallDecorate extends  MeterialDecorate {


    public WallDecorate(HouseDecorate houseDecorate) {
        super(houseDecorate);
    }

    @Override
    void doDecorate() {
        super.houseDecorate.doDecorate();
        System.out.println("粉刷墙壁为白色");
    }
}
