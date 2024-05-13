package org.example.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * 获取代理对象
     *
     * @param clazz 目标对象类型
     * @return
     */
    public Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 实现被代理对象原来功能，同时增加代理对象的额外功能
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib after");
        return invoke;
    }
}
