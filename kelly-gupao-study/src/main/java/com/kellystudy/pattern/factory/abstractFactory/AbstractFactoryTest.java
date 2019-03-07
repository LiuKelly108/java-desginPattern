package com.kellystudy.pattern.factory.abstractFactory;


import com.kellystudy.pattern.factory.abstractFactory.factory.ComputerBookFactory;
import com.kellystudy.pattern.factory.abstractFactory.factory.IBookFactory;
import com.kellystudy.pattern.factory.abstractFactory.factory.MathFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
         IBookFactory factory = new ComputerBookFactory();
         String content =  factory.createBookContent().getContent();
         System.out.println(content);
    }
}
