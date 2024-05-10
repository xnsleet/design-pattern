package org.example.prototype;

import java.util.HashMap;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class ShapeCache {

    private static final HashMap<String,Shape> map = new HashMap<>();

    public static Shape getShape(String type){
        Shape shape = map.get(type);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        map.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("2");
        map.put(square.getId(), square);
    }
}
