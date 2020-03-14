package com.huang.observerpattern.event;


/**
 * @author hsz
 * @data 2020/3/13 21:49:40
 */
public class Test {

    public static void main(String[] args) {
        FanA fanA = new FanA();
        FanB fanB = new FanB();
        Star star = new Star("明星");
        star.registerObserver(fanA);
        star.registerObserver(fanB);
        star.setComment("今天心情很坏");
    }
}
