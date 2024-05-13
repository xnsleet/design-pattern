package org.example.state;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
