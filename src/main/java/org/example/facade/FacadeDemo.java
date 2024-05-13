package org.example.facade;

import org.example.facade.shape.Circle;
import org.example.facade.shape.Rectangle;

/**
 * 外观模式：
 *      为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 主要解决：
 *      降低访问复杂系统的内部子系统时的复杂度，简化客户端之间的接口。
 * 使用场景：
 *      1、为复杂的模块或子系统提供外界访问的模块。
 *      2、子系统相对独立。
 *      3、预防低水平人员带来的风险。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class FacadeDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker(new Circle(), new Rectangle());
        shapeMaker.circle();
        shapeMaker.rectangle();
    }
}
