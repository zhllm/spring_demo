package com.be.self.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkHandler implements InvocationHandler {

    private Object target;

    public JdkHandler(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        Object object = Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );

        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        Object object = method.invoke(target, args);
        System.out.println("执行后");
        return object;
    }
}
