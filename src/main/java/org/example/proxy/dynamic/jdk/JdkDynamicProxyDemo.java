package org.example.proxy.dynamic.jdk;

import org.example.proxy.dynamic.service.StudentService;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author sleet
 * @version 2024/4/11
 */
public class JdkDynamicProxyDemo {

    public static void main(String[] args) {
        /**
         * JDK动态代理
         */
        // 被代理对象/目标对象
        JdkProxyServiceImpl service = new JdkProxyServiceImpl();
        // 创建代理对象
        StudentService proxy = (StudentService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new JdkProxy(service));
        // 调用
        proxy.say("Hello");
    }
}
