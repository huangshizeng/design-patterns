package com.huang.observerpattern.example1;

/**
 * @author hsz
 * @data 2020/3/13 13:56:50
 */
public interface Observer {

    void update(Subject subject, Object object);
}
