package org.example.singleton;

/**
 * 双重检查单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class DoubleCheckSingleton {

    private volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class){
                if (instance==null){
                    return new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
