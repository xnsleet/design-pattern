package org.example.bridging;

import org.example.bridging.draw.BlueCircle;
import org.example.bridging.draw.RedCircle;
import org.example.bridging.shape.Circle;

/**
 * 桥接模式（结构型模式）：
 *      将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 主要解决：
 *      在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 * 使用场景：
 *      1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。
 *      2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 *      3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
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
