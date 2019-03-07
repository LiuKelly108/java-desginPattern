package com.kellystudy.pattern.factory.abstractFactory.book.impl;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookContent;

public class ComputerContent implements IBookContent {
    @Override
    public String getContent() {
        return "java是世界上最优秀的语言！";
    }
}
