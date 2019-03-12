package com.kellystudy.pattern.proxy.staticproxy;

import com.kellystudy.pattern.proxy.staticproxy.order.Order;
import com.kellystudy.pattern.proxy.staticproxy.order.OrderService;
import com.kellystudy.pattern.proxy.staticproxy.order.OrderServiceStaticProxy;

import java.util.Date;

public class StaticProxyTest {

    public static void main(String[] args) {

//        Person person = new Father(new Son());
//            person.findLove();

        Order order =new Order();
        order.setCreateTime(new Date().getTime());
        order.setId("1111");

        OrderServiceStaticProxy osp=new OrderServiceStaticProxy(new OrderService());
        osp.createOrder(order);

    }
}
