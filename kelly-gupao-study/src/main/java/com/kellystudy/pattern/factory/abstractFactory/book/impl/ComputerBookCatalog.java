package com.kellystudy.pattern.factory.abstractFactory.book.impl;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookCatalog;

public class ComputerBookCatalog implements IBookCatalog {
    @Override
    public String getCatalog() {
        return "计算机课本的目录";
    }
}
