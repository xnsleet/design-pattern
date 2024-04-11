package org.example.proxy.staticProxy;

/**
 * @author sleet
 * @version 2024/4/11
 */
public class StudentProxy implements Person{

    private final Person person;

    public StudentProxy(Person person){
        this.person = person;
    }

    @Override
    public void say(String message) {
        // 执行额外的操作
        System.out.println("proxy say");
        person.say(message);
    }
}
