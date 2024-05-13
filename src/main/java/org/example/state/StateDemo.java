package org.example.state;

/**
 * 状态模式（行为型模式）：
 *      允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 主要解决：
 *      对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 * 使用场景：
 *      1、行为随状态改变而改变的场景。
 *      2、条件、分支语句的代替者。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println("------------------------------");
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
