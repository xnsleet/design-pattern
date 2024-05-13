package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/11
 */
public class Composite
        implements Component {

   private static final List<Component> list = new ArrayList<>();

    @Override
    public String operation() {
        return null;
    }

    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public List<Component> getSubordinates() {
        return list;
    }
}
