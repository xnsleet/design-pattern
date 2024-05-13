package org.example.flyweight;

/**
 * 享元模式：
 *      运用共享技术有效地支持大量细粒度的对象。
 * 主要解决：
 *      在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。
 * 使用场景：
 *      1、系统有大量相似对象。
 *      2、需要缓冲池的场景。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        String[] color = {"red", "blue", "green"};

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor(color));
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static String getRandomColor(String[] color) {
        return color[(int) (Math.random() * color.length)];
    }
}
