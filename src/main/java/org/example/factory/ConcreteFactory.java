package org.example.factory;

/**
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class ConcreteFactory
        implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
