package org.example.abstractFactory.factory;

import org.example.abstractFactory.factory.AbstractFactory;
import org.example.abstractFactory.color.Color;
import org.example.abstractFactory.shape.Circle;
import org.example.abstractFactory.shape.Shape;
import org.example.abstractFactory.shape.Square;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class ShapeFactory
        extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if ("Square".equals(shape)) {
            return new Square();
        } else if ("Circle".equals(shape)) {
            return new Circle();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
