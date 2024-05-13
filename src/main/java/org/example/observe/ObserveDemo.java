package org.example.observe;

/**
 * 观察者模式（行为型模式）：
 *      定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 主要解决：
 *      一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 使用场景：
 *      1.一个抽象模型有两个方面，其中一个方面依赖于另一个方面。将这些方面封装在独立的对象中使它们可以各自独立地改变和复用。
 *      2.一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。
 *      3.一个对象必须通知其他对象，而并不知道这些对象是谁。
 *      4.需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。
 * @author sleet
 * @version 2024/5/13
 */
public class ObserveDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState("15");
        System.out.println("----------------------------");
        System.out.println("Second state change: 10");
        subject.setState("10");
    }
}
