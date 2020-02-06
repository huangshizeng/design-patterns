package com.huang.decoratormode.example1;

import com.huang.decoratormode.example1.component.Beverage;
import com.huang.decoratormode.example1.component.Coffee;
import com.huang.decoratormode.example1.decorator.Milk;
import com.huang.decoratormode.example1.decorator.Mocha;

/**
 * 以后新增饮料就继承Beverage，新增调料就继承CondimentDecorator
 *
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Coffee("浓缩咖啡");
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDes() + " 花费了" + beverage.cost() + "元");
    }
}