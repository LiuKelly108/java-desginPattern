package com.kellystudy.pattern.adapter.poweradapter;

public class PowerAdapter implements DC5 {

    private  AC220  ac220 ;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int input = ac220.outputAC220();
        //转换为5V
       int output =  input/44 ;
        System.out.println("输入："+input+"V ,输出："+output+"V");
        return output;
    }
}
