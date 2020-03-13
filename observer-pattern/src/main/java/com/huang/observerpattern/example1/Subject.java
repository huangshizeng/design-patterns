package com.huang.observerpattern.example1;

/**
 * @author hsz
 * @data 2020/3/13 13:55:51
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
