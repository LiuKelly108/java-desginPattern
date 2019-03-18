package com.kellystudy.pattern.decorate.house;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class FurnitureDecorate extends MeterialDecorate {


    public FurnitureDecorate(HouseDecorate houseDecorate) {
        super(houseDecorate);
    }

    @Override
    void doDecorate() {
        super.houseDecorate.doDecorate();
        System.out.println("放家具");
    }
}
