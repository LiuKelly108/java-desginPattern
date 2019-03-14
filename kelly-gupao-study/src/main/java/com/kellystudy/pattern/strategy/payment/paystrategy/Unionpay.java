package com.kellystudy.pattern.strategy.payment.paystrategy;

import com.kellystudy.pattern.strategy.payment.Order;

public class Unionpay implements  Payment{
    @Override
    public void pay(Order order) {
        System.out.println("银联渠道开始支付金额："+order.getAmount());
    }

    @Override
    public double queryBalance() {
        double balance = 6396.21 ;
        System.out.println("银联余额为："+balance);
        return balance;
    }
}
