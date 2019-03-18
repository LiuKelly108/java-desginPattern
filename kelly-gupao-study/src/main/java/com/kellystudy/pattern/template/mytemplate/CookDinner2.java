package com.kellystudy.pattern.template.mytemplate;

/**
 * 第二种模板模式实现方法
 */
public class CookDinner2 {

    private  CookDinner  dinner ;

    public CookDinner2(CookDinner dinner){
        this.dinner =dinner ;
    }

    public  void  cookDinner(){
        this.dinner.cookDinner();
    }

}
