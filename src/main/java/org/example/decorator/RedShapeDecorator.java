package org.example.decorator;

import org.example.decorator.shape.Shape;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class RedShapeDecorator
        extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("RedShapeDecorator");
    }
}
