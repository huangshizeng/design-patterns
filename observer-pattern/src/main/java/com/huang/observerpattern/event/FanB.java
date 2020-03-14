package com.huang.observerpattern.event;

/**
 * @author hsz
 */

public class FanB implements ComtentEventListener {
    @Override
    public void update(ComtentEvent comtentEvent) {
        Star star = comtentEvent.getStar();
        System.out.println("粉丝B收到" + star.getName() + "的发帖：" + star.getComment());
    }
}
