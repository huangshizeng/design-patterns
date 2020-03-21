package com.huang.decoratorpattern.example1.decorator;

import com.huang.decoratorpattern.example1.component.Beverage;

/**
 * 调料，装饰者基类
 *
 * @author hsz
 */

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDes();
}
