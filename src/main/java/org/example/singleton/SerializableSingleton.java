package org.example.singleton;

import java.io.Serializable;

/**
 * 序列化保证单例
 *
 * @author wb.xuening01
 * @version 2024/1/31
 */
public class SerializableSingleton
        implements Serializable {

    private static final Long serialVersionUID =123456789L;

    private SerializableSingleton(){}

    static final SerializableSingleton instance = new SerializableSingleton();

    private Object readResolve(){
        return instance;
    }
}
