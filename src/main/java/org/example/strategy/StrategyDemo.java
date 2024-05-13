package org.example.strategy;

/**
 * 策略模式（行为型模式）：
 *      定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：
 *      在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * 使用场景：
 *      1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 *      2、一个系统需要动态地在几种算法中选择一种。
 *      3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class StrategyDemo {

    public static void main(String[] args) {
        OperationAdd operationAdd = new OperationAdd();
        Context context1 = new Context(operationAdd);
        System.out.println(context1.executeStrategy(1,2));
        System.out.println("---------------------");
        OperationSub operationSub = new OperationSub();
        Context context2 = new Context(operationSub);
        System.out.println(context2.executeStrategy(3,2));
        System.out.println("---------------------");
        OperationMul operationMul = new OperationMul();
        Context context3 = new Context(operationMul);
        System.out.println(context3.executeStrategy(5,2));
    }
}
