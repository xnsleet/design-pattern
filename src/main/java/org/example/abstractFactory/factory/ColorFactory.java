package org.example.abstractFactory.factory;

import org.example.abstractFactory.color.Blue;
import org.example.abstractFactory.color.Color;
import org.example.abstractFactory.color.Red;
import org.example.abstractFactory.factory.AbstractFactory;
import org.example.abstractFactory.shape.Shape;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class ColorFactory
        extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if ("Red".equals(color)) {
            return new Red();
        } else if ("Blue".equals(color)) {
            return new Blue();
        } else {
            return null;
        }
    }
}
