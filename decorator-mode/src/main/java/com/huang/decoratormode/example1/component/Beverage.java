package com.huang.decoratormode.example1.component;


/**
 * 饮料抽象类
 *
 * @author hsz
 */

public abstract class Beverage {

    protected String des;

    public String getDes() {
        return des;
    }

    public abstract double cost();
}
