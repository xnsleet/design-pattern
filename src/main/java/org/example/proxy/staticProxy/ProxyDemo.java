package org.example.proxy.staticProxy;

/**
 * 静态代理
 *
 * @author sleet
 * @version 2024/4/11
 */
public class ProxyDemo {

    public static void main(String[] args) {
        Person person = new Student();
        new StudentProxy(person).say("student hello");
    }
}
