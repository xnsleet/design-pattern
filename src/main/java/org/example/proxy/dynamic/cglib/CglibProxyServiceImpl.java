package org.example.proxy.dynamic.cglib;

import org.example.proxy.dynamic.service.StudentService;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class CglibProxyServiceImpl implements StudentService {

    @Override
    public void say(String message) {
        System.out.println("cglib say "+message);
    }
}
