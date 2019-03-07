package com.kellystudy.pattern.factory.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) throws Exception {
        IBookFactory  factory = new BookFactory();
       String name = factory.createBook("math").getBookName();
        System.out.println(name);
    }
}
