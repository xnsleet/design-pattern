package org.example.abstractFactory.factory;

import org.example.abstractFactory.color.Color;
import org.example.abstractFactory.shape.Shape;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
