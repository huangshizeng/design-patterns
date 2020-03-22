package com.huang.commandpattern.example1;

/**
 * 红烧鱼
 *
 * @author hsz
 */

public class Fish extends Menu {

    public Fish(Cook cook) {
        super(cook);
    }

    @Override
    public void execute() {
        cook.fish();
    }
}
