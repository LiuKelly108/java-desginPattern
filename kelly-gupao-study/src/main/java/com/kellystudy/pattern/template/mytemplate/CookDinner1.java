package com.kellystudy.pattern.template.mytemplate;

public class CookDinner1 extends CookDinner {

    @Override
    void washVegetable() {
        System.out.println("洗白菜和胡萝卜");
    }

    @Override
    void cuttingVegetable() {
        System.out.println("切白菜为丝，胡萝卜为片状");
    }
}
