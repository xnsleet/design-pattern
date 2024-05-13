package org.example.decorator;

import org.example.decorator.shape.Circle;
import org.example.decorator.shape.Rectangle;

/**
 * 装饰器模式（结构型模式）：
 *      动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。
 * 主要解决：
 *      一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。
 * 使用场景：
 *      1、扩展一个类的功能。
 *      2、动态增加功能，动态撤销。
 * @author sleet
 * @version 2024/5/13
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(new Circle());
        redShapeDecorator1.draw();

        System.out.println("------------------------------------------------");
        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(new Rectangle());
        redShapeDecorator2.draw();
    }
}
