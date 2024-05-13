package org.example.chainOfResponsibility;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ErrorLogger
        extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ERROR:" + message);
    }
}
