package com.kellystudy.pattern.factory.abstractFactory.book.impl;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookCatalog;

public class MathBookCatalog implements IBookCatalog {
    @Override
    public String getCatalog() {
        return "数学书的目录";
    }
}
