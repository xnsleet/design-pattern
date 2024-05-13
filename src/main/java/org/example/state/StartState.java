package org.example.state;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class StartState
        implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("StartState");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
