package org.example.factory;

/**
 * 工厂模式（（创建型模式））：
 *      定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 主要解决：
 *      主要解决接口选择的问题。
 * 使用场景：
 *      1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。
 *      2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。
 *      3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class Client {

    private Factory factory;

    public Client(Factory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        Product product = factory.createProduct();
        System.out.println(product);
    }

    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactory());
        client.doSomething();
    }
}
