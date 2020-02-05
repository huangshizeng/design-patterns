package com.huang.decoratormode.example1.decorator;

import com.huang.decoratormode.example1.component.Beverage;

/**
 * 牛奶装饰类
 *
 * @author hsz
 */

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDes() {
        return beverage.getDes() + " 牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 6;
    }
}
