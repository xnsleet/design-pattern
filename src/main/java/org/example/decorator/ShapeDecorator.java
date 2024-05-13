package org.example.decorator;

import org.example.decorator.shape.Shape;

/**
 * @author sleet
 * @version 2024/5/13
 */
public abstract class ShapeDecorator
        implements Shape {

    public final Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
