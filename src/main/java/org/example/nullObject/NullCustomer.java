package org.example.nullObject;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class NullCustomer
        extends AbstractCustomer {

    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "Not Available in Customer Database";
    }
}
