package org.example.chainOfResponsibility;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ConsoleLogger
        extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("CONSOLE:" + message);
    }
}
