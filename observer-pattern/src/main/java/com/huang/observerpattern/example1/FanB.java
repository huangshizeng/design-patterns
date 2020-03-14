package com.huang.observerpattern.example1;

/**
 * @author hsz
 * @data 2020/3/13 21:48:41
 */
public class FanB implements Observer {
    @Override
    public void update(Subject subject, Object object) {
        Star star = (Star) subject;
        System.out.println("粉丝B收到" + star.getName() + "发帖:" + object.toString());
    }
}
