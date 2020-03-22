package com.huang.commandpattern.example1;

/**
 * 厨师，相当于Receiver
 *
 * @author hsz
 */

public class Cook {

    public void chicken() {
        System.out.println("厨师正在做小鸡炖蘑菇...");
    }

    public void fish() {
        System.out.println("厨师正在做红烧鱼...");
    }
}
