package com.kellystudy.pattern.factory.abstractFactory.factory;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookCatalog;
import com.kellystudy.pattern.factory.abstractFactory.book.IBookContent;
import com.kellystudy.pattern.factory.abstractFactory.book.impl.MathBookCatalog;
import com.kellystudy.pattern.factory.abstractFactory.book.impl.MathBookContent;

public class MathFactory implements IBookFactory {

    //创建英语书的目录
    @Override
    public IBookCatalog createBookCatalog() {
        return new MathBookCatalog();
    }

    @Override
    public IBookContent createBookContent() {
        return new MathBookContent();
    }
}
