package com.kellystudy.pattern.delegate;

public class DelegateTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构",new Master());
    }
}
