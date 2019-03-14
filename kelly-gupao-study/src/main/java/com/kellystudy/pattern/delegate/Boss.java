package com.kellystudy.pattern.delegate;

public class Boss {

    public  void  command(String  command,Master master){
        master.doing(command);
    }
}
