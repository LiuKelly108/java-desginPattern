package com.kellystudy.pattern.strategy.payment.paystrategy;

import com.kellystudy.pattern.strategy.payment.Order;

/**
 * 支付宝渠道的支付方式
 */
public class Alipay implements Payment {
    @Override
    public void pay(Order order) {
        System.out.println("-----支付宝开始扣款操作，扣款金额为："+order.getAmount());
    }

    @Override
    public double queryBalance() {
        double balance = 5000.00;
        System.out.println("---支付宝账户的余额是："+balance);
        return balance;
    }
}
