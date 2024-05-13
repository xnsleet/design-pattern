package org.example.chainOfResponsibility;

/**
 * @author sleet
 * @version 2024/5/13
 */
public abstract class AbstractLogger {

    public static int ERROOR = 1;

    public static int CONSOLE = 2;

    protected int level;

    // 责任链的下一个元素
    protected AbstractLogger nextAbstractLogger;

    void setNextAbstractLogger(AbstractLogger nextAbstractLogger) {
        this.nextAbstractLogger = nextAbstractLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (nextAbstractLogger != null) {
            nextAbstractLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
