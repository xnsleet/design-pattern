package org.example.bridging;

import org.example.bridging.draw.BlueCircle;
import org.example.bridging.draw.RedCircle;
import org.example.bridging.shape.Circle;

/**
 * 桥接模式：将抽象部分与实现部分分离，使它们都可以独立的变化。
 *
 * @author sleet
 * @version 2024/5/10
 */
public class BridgingDemo {

    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedCircle(), 1, 2, 3);
        Circle blueCircle = new Circle(new BlueCircle(), 1, 2, 3);
        redCircle.draw();
        blueCircle.draw();
    }
}
