package org.example.builder.meal;

import org.example.builder.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/10
 */
public class Meal {

    private final List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public Float getPrice() {
        float price = 0f;
        for (Item item : list) {
            price += item.price();
        }
        return price;
    }

    public void showItems() {
        for (Item item : list) {
            System.out.print("packing:" + item.getPacking().pack());
            System.out.print(",name:" + item.name());
            System.out.println(",pirce:" + item.price());
        }
    }
}
