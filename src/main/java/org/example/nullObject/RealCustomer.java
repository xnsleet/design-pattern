package org.example.nullObject;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class RealCustomer
        extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return this.name;
    }
}
