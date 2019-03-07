package com.kellystudy.pattern.factory;

/**
* Create by zhangyuan
* Description: 英语书
* Date: 2019/3/7 17:24
*/
public class EnglishBook implements IBook {
    @Override
    public String getBookName() {
        return "英语书";
    }

    @Override
    public String getAuthor() {
        return "kelly";
    }

    @Override
    public String getCatalog() {
        return "英语书的目录";
    }

    @Override
    public String getContent() {
        return "Hello! I am fine. Thank you! ";
    }


}
