package org.example.state;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class StopState
        implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("StopState");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
