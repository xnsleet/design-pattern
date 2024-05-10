package org.example.builder.item.coldDrink;

import org.example.builder.packing.Bottle;
import org.example.builder.item.Item;
import org.example.builder.packing.Packing;

/**
 * @author sleet
 * @version 2024/5/10
 */
public abstract class ColdDrink
        implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
