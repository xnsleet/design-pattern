package org.example.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class CareTaker {

    public static final List<Memento> list = new ArrayList<>();

    public void add(Memento memento){
        list.add(memento);
    }

    public Memento get(int index){
        return list.get(index);
    }
}
