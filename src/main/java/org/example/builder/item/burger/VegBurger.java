package org.example.builder.item.burger;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class VegBurger
        extends Burger {

    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Float price() {
        return 3f;
    }
}
