package org.example.abstractFactory;

import org.example.abstractFactory.factory.FactorProducer;

/**
 * 抽象工厂（创建型模式）：
 *      提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 主要解决：
 *      主要解决接口选择的问题。
 * 使用场景：
 *      1、QQ 换皮肤，一整套一起换。
 *      2、生成不同操作系统的程序。
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
