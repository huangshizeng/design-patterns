package com.huang.commandpattern.example1;

/**
 * 服务员，相当于Invoker
 *
 * @author hsz
 */

public class Waiter {

    private Menu menu;

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void notice() {
        menu.execute();
    }
}
