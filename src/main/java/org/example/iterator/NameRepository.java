package org.example.iterator;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class NameRepository
        implements Container {

    private final String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
