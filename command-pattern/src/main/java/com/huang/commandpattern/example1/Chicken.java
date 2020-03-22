package com.huang.commandpattern.example1;

/**
 * 小鸡炖蘑菇，相当于具体Command
 *
 * @author hsz
 */

public class Chicken extends Menu {


    public Chicken(Cook cook) {
        super(cook);
    }

    @Override
    public void execute() {
        cook.chicken();
    }
}
