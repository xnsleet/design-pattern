package org.example.bridging.draw;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class RedCircle
        implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
