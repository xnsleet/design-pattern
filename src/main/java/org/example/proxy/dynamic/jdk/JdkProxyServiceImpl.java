package org.example.proxy.dynamic.jdk;

import org.example.proxy.dynamic.service.StudentService;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class JdkProxyServiceImpl implements StudentService {

    @Override
    public void say(String message) {
        System.out.println("jdk proxy say " + message);
    }
}
