package org.example.singleton;

/**
 * 安全又支持延迟的单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class LazyLoadedSingleton {

    private LazyLoadedSingleton() {
    }

    private static class LazyHolder {
        private static final LazyLoadedSingleton instance = new LazyLoadedSingleton();
    }

    public static LazyLoadedSingleton getInstance() {
        return LazyHolder.instance;
    }
}
