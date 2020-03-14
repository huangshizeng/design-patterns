package com.huang.observerpattern.event;

import java.util.EventObject;

/**
 * @author hsz
 */

public class ComtentEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ComtentEvent(Object source) {
        super(source);
    }

    public Star getStar() {
        return (Star) super.getSource();
    }
}
