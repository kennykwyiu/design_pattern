package org.kenny.design.pattern.structural.proxy;

public class OrderDaoImpl implements IOrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("Dao layer add order successfully");
        return 1;
    }
}
