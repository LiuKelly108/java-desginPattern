package com.kellystudy.pattern.proxy.staticproxy.order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    private IOrderService orderService ;

    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService=orderService;
    }

    public void createOrder(Order order) {
        before();
        Long time=order.getCreateTime();
        //获得订单的创建时间
        Integer dbRouter = Integer.valueOf(sdf.format(new Date(time)));
        //切换数据库
        DynamicDataSource.set(dbRouter);
        //实现业务逻辑
        orderService.createOrder(order);
        after();
    }

    private void before(){
        System.out.println("-------开始准备----");
    }
    private void after(){
        System.out.println("------结束后处理----");
    }
}
