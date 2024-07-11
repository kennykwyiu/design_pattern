package org.kenny.design.pattern.structural.proxy.dynamicproxy;

import org.kenny.design.pattern.structural.proxy.IOrderService;
import org.kenny.design.pattern.structural.proxy.Order;
import org.kenny.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
