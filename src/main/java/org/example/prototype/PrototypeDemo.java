package org.example.prototype;

/**
 * 克隆模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * @author sleet
 * @version 2024/5/10
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("shape1:"+shape1.getType());
        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("shape2:"+shape2.getType());
    }
}
