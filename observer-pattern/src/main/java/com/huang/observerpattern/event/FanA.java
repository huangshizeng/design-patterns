package com.huang.observerpattern.event;

/**
 * @author hsz
 */

public class FanA implements ComtentEventListener {
    @Override
    public void update(ComtentEvent comtentEvent) {
        Star star = comtentEvent.getStar();
        System.out.println("粉丝A收到" + star.getName() + "的发帖：" + star.getComment());
    }
}
