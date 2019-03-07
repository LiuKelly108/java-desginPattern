package com.kellystudy.pattern.factory.abstractFactory.factory;

import com.kellystudy.pattern.factory.abstractFactory.book.IBookCatalog;
import com.kellystudy.pattern.factory.abstractFactory.book.IBookContent;
import com.kellystudy.pattern.factory.abstractFactory.book.impl.ComputerBookCatalog;
import com.kellystudy.pattern.factory.abstractFactory.book.impl.ComputerContent;
import com.kellystudy.pattern.factory.abstractFactory.factory.IBookFactory;

public class ComputerBookFactory implements IBookFactory {
    @Override
    public IBookCatalog createBookCatalog() {
        return new ComputerBookCatalog();
    }

    @Override
    public IBookContent createBookContent() {
        return new ComputerContent();
    }
}
