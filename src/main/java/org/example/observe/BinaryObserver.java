package org.example.observe;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class BinaryObserver
        extends Observe {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Binary String: " + subject.getState());
    }
}
