package com.kellystudy.pattern.strategy.payment;

import com.kellystudy.pattern.strategy.payment.paystrategy.Payment;

public class StrategyTest {

    public static void main(String[] args) {

        String payType="alipay";

        Order order =new Order("123456","小龙儿",6000, payType);
//        Payment payment =  PayStrategy.getPayMentByKey(payType).getPayment();
//        payment.pay(order);
          order.pay();
    }
}
