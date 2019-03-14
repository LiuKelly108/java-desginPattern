package com.kellystudy.pattern.strategy.payment;

import com.kellystudy.pattern.strategy.payment.paystrategy.Payment;

public class Order {

    private String id ; //订单id
    private String name; //客户姓名
    private String account;//订单的支付账户
    private double amount ;//支付金额
    private String paytype; //支付方式

    public Order(String id, String name, double amount, String paytype) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.paytype = paytype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAccount(double amount) {
        this.amount = amount;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    //*****************************
    public void pay(){
        PayStrategy.getPayMentByKey(this.paytype).getPayment().pay(this);
    }
}
