package com.kellystudy.pattern.delegate;

public class EmployeeA  implements  IEmployee{
    @Override
    public void doing(String command) {

        System.out.println("我是员工A，擅长架构，可以做架构的工作！开始干"+command);
    }
}
