package org.kenny.design.pattern.structural.proxy.staticproxy;

import org.kenny.design.pattern.structural.proxy.IOrderService;
import org.kenny.design.pattern.structural.proxy.Order;
import org.kenny.design.pattern.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("static proxy arrange [db" + dbRouter + "] to handle the data");

        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("static proxy before code");
    }

    private  void afterMethod() {
        System.out.println("static proxy after code");
    }
}
