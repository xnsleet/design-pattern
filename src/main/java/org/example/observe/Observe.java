package org.example.observe;

/**
 * @author sleet
 * @version 2024/5/13
 */
public abstract class Observe {

    protected Subject subject;

    abstract void update();
}
