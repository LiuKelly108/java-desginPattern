package com.kellystudy.pattern.template.mytemplate;

public class CookDinnerTest {

    public static void main(String[] args) {
//        CookDinner dinner =new CookDinner1();
//        dinner.cookDinner();


        CookDinner2 cookDinner2 =  new  CookDinner2(new CookDinner() {
            @Override
            void washVegetable() {
                System.out.println("洗黄瓜和土豆");
            }

            @Override
            void cuttingVegetable() {
                System.out.println("切土豆为丝，黄瓜为片状");
            }
        });
        cookDinner2.cookDinner();
    }
}
