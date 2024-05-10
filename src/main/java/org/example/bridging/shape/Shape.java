package org.example.bridging.shape;

import org.example.bridging.draw.DrawAPI;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
