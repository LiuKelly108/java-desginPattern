package com.kellystudy.pattern.template.mytemplate;

/**
 * 做饭的模板模式
 */
public abstract  class CookDinner {

    final void cookDinner(){
        getPot();
        washVegetable();
        cuttingVegetable();
        friedVegetable();
        putFlavour();
       outPot();
    }

    final void  getPot(){
        System.out.println("取出一个平底锅");
    }
    //2.洗菜
    abstract void  washVegetable();

    //3、切菜
    abstract  void  cuttingVegetable();

    //4、炒菜
    final  void friedVegetable(){
        System.out.println("炒菜");
    }
    //5、放调料
    final  void  putFlavour(){
        System.out.println("放调料");
    }
    //6、出锅
    final  void outPot(){
        System.out.println("出锅");
    }


}
