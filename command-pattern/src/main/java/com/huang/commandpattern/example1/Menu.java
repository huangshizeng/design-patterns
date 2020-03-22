package com.huang.commandpattern.example1;

/**
 * 菜单，相当于Command
 *
 * @author hsz
 */
public abstract class Menu {

    protected Cook cook;

    public Menu(Cook cook) {
        this.cook = cook;
    }

    public abstract void execute();
}
