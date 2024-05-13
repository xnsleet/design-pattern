package org.example.mediator;

/**
 * 中介者模式：
 *      用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 * 主要解决：
 *      对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
 * 使用场景：
 *      1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 *      2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 * @author sleet
 * @version 2024/5/13
 */
public class MediatorDemo {

    public static void main(String[] args) {
        User tom = new User("tom");
        tom.sendMessage("hello");
        User jack = new User("jack");
        jack.sendMessage("thanks");
    }
}
