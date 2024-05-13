package org.example.chainOfResponsibility;

import static org.example.chainOfResponsibility.AbstractLogger.CONSOLE;
import static org.example.chainOfResponsibility.AbstractLogger.ERROOR;

/**
 * 责任链模式（行为型模式）：
 *      避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 * 主要解决：
 *      职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
 * 使用场景：
 *      1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。
 *      2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 *      3、可动态指定一组对象处理请求。
 *
 * @author sleet
 * @version 2024/5/13
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        AbstractLogger chainLogger = getChainOfLogger();
        chainLogger.logMessage(CONSOLE,"message");
    }

    private static AbstractLogger getChainOfLogger() {
        ErrorLogger errorLogger = new ErrorLogger(ERROOR);
        ConsoleLogger consoleLogger = new ConsoleLogger(CONSOLE);
        errorLogger.setNextAbstractLogger(consoleLogger);
        return errorLogger;
    }
}
