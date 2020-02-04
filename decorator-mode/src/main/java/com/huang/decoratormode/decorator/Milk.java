package com.huang.decoratormode.decorator;

import com.huang.decoratormode.component.Beverage;

/**
 * 牛奶装饰类
 *
 * @author hsz
 */

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
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
