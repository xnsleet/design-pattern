package org.example.command;

import org.example.command.order.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Broker {

    private static final List<Order> list = new ArrayList<>();

    public void takeOrder(Order order){
        list.add(order);
    }

    public void placeOrders(){
        for (Order order : list) {
            order.execute();
        }
        list.clear();
    }
}
