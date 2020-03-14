package com.huang.observerpattern.event;

import java.util.EventListener;

/**
 * @author hsz
 */

public interface ComtentEventListener extends EventListener {

    public void update(ComtentEvent comtentEvent);
}
