package com.kellystudy.pattern.factory.simpleFactory;

import com.kellystudy.pattern.factory.IBook;
import com.kellystudy.pattern.factory.MathBook;

public class BookFactory implements IBookFactory {
    @Override
    public IBook createBook(String bookName) throws Exception {
        IBook book =null ;
        if("math".equals(bookName)){
            book = MathBook.class.newInstance();
        }else if("english".equals(bookName)){
            book = (IBook)Class.forName("com.kellystudy.pattern.factory.EnglishBook").newInstance();
        }
        return  book;
    }
}
