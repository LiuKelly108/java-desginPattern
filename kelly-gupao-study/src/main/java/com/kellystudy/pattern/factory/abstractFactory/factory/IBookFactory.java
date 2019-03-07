package com.kellystudy.pattern.factory.abstractFactory.factory;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookCatalog;
import com.kellystudy.pattern.factory.abstractFactory.book.IBookContent;

public interface IBookFactory {

    //创建目录
    IBookCatalog createBookCatalog();

    //创建书内容
    IBookContent createBookContent();




}
