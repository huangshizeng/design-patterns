package com.huang.decoratormode.example1.component;

/**
 * 咖啡类，具体被装饰者
 *
 * @author hsz
 */

public class Coffee extends Beverage {

    public Coffee(String des) {
        this.des = des;
    }

    @Override
    public double cost() {
        return 10;
    }
}
