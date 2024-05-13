package org.example.command;

import org.example.command.order.BuyStock;
import org.example.command.order.SellStock;

/**
 * 命令模式（行为型模式）：
 *      将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。
 * 主要解决：
 *      在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 * 使用场景：
 *      认为是命令的地方都可以使用命令模式，比如：
 *      1、GUI 中每一个按钮都是一条命令。
 *      2、模拟 CMD。
 * @author sleet
 * @version 2024/5/13
 */
public class CommandDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
