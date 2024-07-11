package org.kenny.design.pattern.structural.proxy.dynamicproxy;

import org.kenny.design.pattern.structural.proxy.Order;
import org.kenny.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        return object;
    }

    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("Dynamic proxy before code");
        if (object instanceof Order) {
            userId = ((Order) object).getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("Dynamic proxy arrange [db" + dbRouter + "] to handle the data");

        //todo setting dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("Dynamic proxy after code");
    }
}
