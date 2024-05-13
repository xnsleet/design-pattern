package org.example.strategy;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Context {

    public final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
