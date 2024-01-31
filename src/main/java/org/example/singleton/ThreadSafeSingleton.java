package org.example.singleton;

/**
 * 线程安全单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class ThreadSafeSingleton {

    private ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new ThreadSafeSingleton();
        }
        return instance;
    }
}
