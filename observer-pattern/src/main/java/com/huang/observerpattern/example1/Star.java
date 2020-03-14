package com.huang.observerpattern.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hsz
 * @data 2020/3/13 21:13:00
 */
public class Star implements Subject {

    private String name;
    private String comment;
    private final List<Observer> observerList = new ArrayList<Observer>();

    public Star(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> {
            o.update(this, comment);
        });
    }
}
