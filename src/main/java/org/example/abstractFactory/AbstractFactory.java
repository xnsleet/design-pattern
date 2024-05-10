package org.example.abstractFactory;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
