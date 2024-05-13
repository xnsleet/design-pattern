package org.example.visitor;

import org.example.visitor.part.Computer;

/**
 * 访问者模式（行为型模式）：
 *      主要将数据结构与数据操作分离。
 * 主要解决：
 *      稳定的数据结构和易变的操作耦合问题。
 * 使用场景：
 *      1、对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作。
 *      2、需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作"污染"这些对象的类，也不希望在增加新操作时修改这些类。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class VisitorDemo {

    public static void main(String[] args) {
        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();
        computer.accept(computerPartDisplayVisitor);
    }
}
