package org.example.singleton;

/**
 * 普通单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}
