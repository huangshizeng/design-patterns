package com.huang.decoratormode.example1.decorator;

import com.huang.decoratormode.example1.component.Beverage;

/**
 * 摩卡装饰类
 *
 * @author hsz
 */

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDes() {
        return beverage.getDes() + " 摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }
}
