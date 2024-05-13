package org.example.facade;

import org.example.facade.shape.Shape;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ShapeMaker {

    private final Shape circle;

    private final Shape rectangle;

    public ShapeMaker(Shape circle, Shape rectangle) {
        this.circle = circle;
        this.rectangle = rectangle;
    }

    public void circle() {
        circle.draw();
    }

    public void rectangle() {
        rectangle.draw();
    }
}
