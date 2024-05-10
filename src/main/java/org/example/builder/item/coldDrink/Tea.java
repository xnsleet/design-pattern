package org.example.builder.item.coldDrink;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Tea
        extends ColdDrink{

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public Float price() {
        return 3f;
    }
}
