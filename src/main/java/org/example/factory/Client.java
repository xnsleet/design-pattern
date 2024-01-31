package org.example.factory;

/**
 * 工厂方法
 * 解释：
 *  为创建对象定义一个接口，让子类决定实例哪个对类。工厂方法让一个类的实例化延迟到子类。
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
