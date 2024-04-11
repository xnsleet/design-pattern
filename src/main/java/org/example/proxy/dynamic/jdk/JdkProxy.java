package org.example.proxy.dynamic.jdk;

import org.example.proxy.dynamic.StudentService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class JdkProxy implements InvocationHandler {

    private final StudentService target;

    public JdkProxy(StudentService studentService){
        this.target = studentService;
    }

    /**
     * 通过反射机制，实现被代理对象原来功能，同时增加代理对象的额外功能。
     *
     * @param proxy  代理对象
     * @param method 动态代理的方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("proxy before");
        Object invoke = method.invoke(target, args);
        System.out.println("proxy after");

        return invoke;
    }
}
