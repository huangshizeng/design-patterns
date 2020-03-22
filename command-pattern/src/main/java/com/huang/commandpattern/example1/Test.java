package com.huang.commandpattern.example1;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Cook cook = new Cook();
        Chicken chicken = new Chicken(cook);
        Fish fish = new Fish(cook);

        waiter.setMenu(chicken);
        waiter.notice();
        waiter.setMenu(fish);
        waiter.notice();
    }
}
