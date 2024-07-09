package org.kenny.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService{
    private IOrderDao iOrderDao;


    @Override
    public int saveOrder(Order order) {
        // spring will auto-inject OrderDaoImpl
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service layer add Order by using Dao layer");
        return iOrderDao.insert(order);
    }
}
