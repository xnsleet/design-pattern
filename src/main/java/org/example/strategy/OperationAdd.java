package org.example.strategy;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class OperationAdd
        implements Strategy {

    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
