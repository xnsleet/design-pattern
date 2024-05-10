package org.example.builder.item.coldDrink;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Coffer
        extends ColdDrink {
    @Override
    public String name() {
        return "Coffer";
    }

    @Override
    public Float price() {
        return 2f;
    }
}
