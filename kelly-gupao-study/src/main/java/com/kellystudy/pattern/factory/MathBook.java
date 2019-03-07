package com.kellystudy.pattern.factory;

/**
* Create by zhangyuan
* Description: 数学书
* Date: 2019/3/7 17:20
*/
public class MathBook implements IBook {


    @Override
    public String getBookName() {
        return "数学课本";
    }

    @Override
    public String getAuthor() {
        return "小龙儿";
    }

    @Override
    public String getCatalog() {
        return "数学书的目录";
    }

    @Override
    public String getContent() {
        return "1+1=2;2+2=4";
    }

}
