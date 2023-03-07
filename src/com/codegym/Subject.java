package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void add(Observer o) {
        observers.add(o);
    }

    public void setState (int value) {
        this.state = value;
        execute();
    }

    public int getState() {
        return state;
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
