package org.example.singleton;

/**
 * 普通单例（创建型模式）：
 *      保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 主要解决：
 *      一个全局使用的类频繁地创建与销毁。
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
