package org.example.abstractFactory;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Circle
        implements Shape {

    @Override
    public void getShape() {
        System.out.println("Circle");
    }
}
