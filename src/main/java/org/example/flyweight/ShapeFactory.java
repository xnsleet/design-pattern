package org.example.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ShapeFactory {

    private static final Map<String, Shape> map = new ConcurrentHashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);
        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
