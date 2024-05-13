package org.example.interpreter;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class TerminalExpression
        implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        return context.contains(data);
    }
}
