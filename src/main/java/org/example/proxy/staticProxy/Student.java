package org.example.proxy.staticProxy;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class Student implements Person{
    @Override
    public void say(String message) {
        System.out.println(message);
    }
}
