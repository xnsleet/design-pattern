package org.example.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Subject {

    private String state;

    private static final List<Observe> list = new ArrayList<>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObserves();
    }

    public void attach(Observe observe){
        list.add(observe);
    }

    public void notifyAllObserves(){
        for (Observe observe : list) {
            observe.update();
        }
    }
}
