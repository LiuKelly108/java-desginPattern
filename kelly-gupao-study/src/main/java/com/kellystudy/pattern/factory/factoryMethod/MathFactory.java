package com.kellystudy.pattern.factory.factoryMethod;


import com.kellystudy.pattern.factory.IBook;
import com.kellystudy.pattern.factory.MathBook;

public class MathFactory implements IBookFactory {


    @Override
    public IBook createBook() {
        return new MathBook();
    }
}
