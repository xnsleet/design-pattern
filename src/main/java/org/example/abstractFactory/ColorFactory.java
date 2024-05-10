package org.example.abstractFactory;

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
