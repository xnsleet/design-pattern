package org.example.prototype;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Rectangle
        extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void shape() {
        System.out.println("Rectangle");
    }
}
