package com.kellystudy.pattern.factory.factoryMethod;

import com.kellystudy.pattern.factory.EnglishBook;
import com.kellystudy.pattern.factory.IBook;

public class EnglishFactory implements IBookFactory {
    @Override
    public IBook createBook() {
        return new EnglishBook();
    }
}
