package com.huang.observerpattern.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hsz
 * @data 2020/3/13 21:13:00
 */
public class Star {

    private String name;
    private String comment;
    private final List<ComtentEventListener> listeners = new ArrayList<>();

    public Star(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
        this.comment = comment;
        ComtentEvent comtentEvent = new ComtentEvent(this);
        notifyObservers(comtentEvent);
    }

    public String getComment() {
        return comment;
    }

    public String getName() {
        return name;
    }

    public void notifyObservers(ComtentEvent comtentEvent) {
        listeners.forEach(listener -> listener.update(comtentEvent));
    }

    public void registerObserver(ComtentEventListener listener) {
        listeners.add(listener);
    }

    public void removeObserver(ComtentEventListener listener) {
        listeners.remove(listener);
    }
}
