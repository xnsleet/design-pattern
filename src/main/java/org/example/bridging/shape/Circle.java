package org.example.bridging.shape;

import org.example.bridging.draw.DrawAPI;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Circle
        extends Shape {

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(x, y, radius);
    }
}
