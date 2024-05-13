package org.example.observe;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class OctalObserver
        extends Observe {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("OctalObserver String: " + subject.getState());
    }
}
