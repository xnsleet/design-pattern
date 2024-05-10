package org.example.abstractFactory;

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
