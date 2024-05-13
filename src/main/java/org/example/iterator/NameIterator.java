package org.example.iterator;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class NameIterator
        implements Iterator {

    private final String[] names;

    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return names.length > index;
    }

    @Override
    public Object next() {
        return names[index++];
    }
}
