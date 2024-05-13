package org.example.composite;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class Leaf
        implements Component {

    private final String operation;

    public Leaf(String operation) {
        this.operation = operation;
    }

    @Override
    public String operation() {
        return operation;
    }
}
