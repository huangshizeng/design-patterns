package com.huang.decoratormode.decorator;

import com.huang.decoratormode.component.Beverage;

/**
 * 调料，装饰者基类
 *
 * @author hsz
 */

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDes();
}
