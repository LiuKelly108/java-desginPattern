package com.kellystudy.pattern.delegate;

import java.util.HashMap;

public class Master implements IEmployee{

    private static HashMap<String,IEmployee> employeeHashMap =new HashMap<String, IEmployee>();

    static {
        employeeHashMap.put("架构",new EmployeeA());
        employeeHashMap.put("编码",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        employeeHashMap.get(command).doing(command);
    }
}
