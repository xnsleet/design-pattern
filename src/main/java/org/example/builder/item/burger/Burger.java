package org.example.builder.item.burger;

import org.example.builder.item.Item;
import org.example.builder.packing.Packing;
import org.example.builder.packing.Wrapper;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class Burger
        implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
