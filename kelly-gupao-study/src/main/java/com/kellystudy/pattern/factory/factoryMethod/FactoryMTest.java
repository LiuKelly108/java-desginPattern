package com.kellystudy.pattern.factory.factoryMethod;

public class FactoryMTest {
    public static void main(String[] args) {
        IBookFactory factory = new EnglishFactory();
        String content = factory.createBook().getContent();
        System.out.println(content);
    }
}
