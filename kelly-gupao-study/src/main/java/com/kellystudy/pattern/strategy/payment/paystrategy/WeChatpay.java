package com.kellystudy.pattern.strategy.payment.paystrategy;

import com.kellystudy.pattern.strategy.payment.Order;

/**
 * 微信渠道的支付方法
 */
public class WeChatpay implements Payment {
    @Override
    public void pay(Order order) {
        System.out.println("---微信钱包开始支付金额："+order.getAmount());
    }

    @Override
    public double queryBalance() {
        double balance =500.63 ;
        System.out.println("微信钱包的余额为："+balance);
        return balance;
    }
}
