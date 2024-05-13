package org.example.memento;

/**
 * 备忘录模式（行为型模式）：
 *      在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 * 主要解决：
 *      所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 * 使用场景：
 *      1、需要保存/恢复数据的相关状态场景。
 *      2、提供一个可回滚的操作。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class MementoDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.setStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.setStateToMemento());
        originator.setState("state #4");
        careTaker.add(originator.setStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
