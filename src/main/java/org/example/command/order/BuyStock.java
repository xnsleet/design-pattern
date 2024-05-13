package org.example.command.order;

import org.example.command.Stock;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class BuyStock
        implements Order {

    private final Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
