package com.kellystudy.pattern.factory.simpleFactory;

import com.kellystudy.pattern.factory.IBook;

public interface IBookFactory {
    //生产书
    IBook createBook(String bookName) throws Exception;
}
