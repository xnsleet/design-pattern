package org.example.prototype;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Square
        extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void shape() {
        System.out.println("Square");
    }
}
