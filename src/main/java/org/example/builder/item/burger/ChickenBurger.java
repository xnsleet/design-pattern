package org.example.builder.item.burger;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class ChickenBurger
        extends Burger {

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Float price() {
        return 5f;
    }
}
