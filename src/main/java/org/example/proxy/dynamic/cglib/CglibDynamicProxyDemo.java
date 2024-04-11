package org.example.proxy.dynamic.cglib;

import org.example.proxy.dynamic.StudentService;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class CglibDynamicProxyDemo {

    public static void main(String[] args) {
        StudentService serviceImpl = (StudentService) new CglibProxy().getProxy(CglibProxyServiceImpl.class);
        serviceImpl.say("Hi");
    }
}
