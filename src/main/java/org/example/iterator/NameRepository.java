package org.example.iterator;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class NameRepository
        implements Container {

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
