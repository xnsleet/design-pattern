package org.example.abstractFactory;

import org.example.abstractFactory.factory.FactorProducer;

/**
 * 抽象工厂：
 *      提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 主要解决：
 *      主要解决接口选择的问题。
 *
 * @author sleet
 * @version 2024/5/10
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        FactorProducer.getFactory("Color").getColor("Red").getColor();
        FactorProducer.getFactory("Shape").getShape("Circle").getShape();
    }
}
