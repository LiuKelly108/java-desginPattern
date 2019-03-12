package com.kellystudy.pattern.proxy.staticproxy.recharge;

public class RechargeStaticProxyTest {

    public static void main(String[] args) {

        IConsumer  c =(IConsumer)new RechargeStaticProxy( new RechargeService());
        c.rechargeCellPhone();
    }
}
