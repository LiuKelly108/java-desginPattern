package com.kellystudy.pattern.decorate.house;

public class HouseDecorateTest {

    public static void main(String[] args) {
        HouseDecorate  houseDecorate ;
        houseDecorate =new BaseHouseDecorate();
        houseDecorate = new FloorDecorate(houseDecorate);
        houseDecorate = new WallDecorate(houseDecorate);
        houseDecorate = new FurnitureDecorate(houseDecorate);
        houseDecorate.doDecorate();
    }
}
