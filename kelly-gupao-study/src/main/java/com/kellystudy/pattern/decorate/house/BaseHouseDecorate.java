package com.kellystudy.pattern.decorate.house;

public class BaseHouseDecorate extends HouseDecorate {



    @Override
    void doDecorate() {
        System.out.println("毛坯房子");
    }
}
