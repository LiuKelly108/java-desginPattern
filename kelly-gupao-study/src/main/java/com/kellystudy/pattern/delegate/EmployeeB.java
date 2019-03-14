package com.kellystudy.pattern.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String  command) {
        System.out.println("我是员工B，擅长做编码!开始干:"+command);
    }
}
