package com.kellystudy.pattern.factory.abstractFactory.book.impl;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookContent;

public class MathBookContent implements IBookContent {
    @Override
    public String getContent() {
        return "1+1=2, 2+2 =4 ! ";
    }
}
