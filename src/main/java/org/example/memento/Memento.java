package org.example.memento;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
