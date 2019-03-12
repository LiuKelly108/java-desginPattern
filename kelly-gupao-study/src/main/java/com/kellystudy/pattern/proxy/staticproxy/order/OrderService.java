package com.kellystudy.pattern.proxy.staticproxy.order;

public class OrderService implements IOrderService{

    private OrderDao  dao ;

    public OrderService(){
        this.dao =new OrderDao();

    }

    public OrderService(OrderDao dao) {
        this.dao = dao;
    }

    public void createOrder(Order order) {
        System.out.println("----OrderService调用orderDao插入订单----");
        dao.insert(order);
    }
}
