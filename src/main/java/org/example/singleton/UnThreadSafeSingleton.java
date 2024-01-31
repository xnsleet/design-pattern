package org.example.singleton;

/**
 * 线程不安全单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class UnThreadSafeSingleton {

    private UnThreadSafeSingleton instance;

    private UnThreadSafeSingleton(){}

    public UnThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new UnThreadSafeSingleton();
        }
        return instance;
    }
}
