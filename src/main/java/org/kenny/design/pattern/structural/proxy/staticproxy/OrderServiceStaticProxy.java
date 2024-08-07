package org.kenny.design.pattern.structural.proxy.staticproxy;

import org.kenny.design.pattern.structural.proxy.IOrderService;
import org.kenny.design.pattern.structural.proxy.Order;
import org.kenny.design.pattern.structural.proxy.OrderServiceImpl;
import org.kenny.design.pattern.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("static proxy arrange [db" + dbRouter + "] to handle the data");

        //todo setting dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("static proxy before code");
    }

    private void afterMethod() {
        System.out.println("static proxy after code");
    }
}
