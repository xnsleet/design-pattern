package org.example.builder.item;

import org.example.builder.packing.Packing;

/**
 * @author sleet
 * @version 2024/5/10
 */
public interface Item {

    String name();

    Packing getPacking();

    Float price();
}
