package com.huang.strategymode.strategy;

/**
 * 加法策略
 *
 * @author hsz
 */

public class Division implements CalculatorStrategy {

    public void compute(int a, int b) {
        System.out.println("除法运算：" + a + "/" + b + "=" + (a / b));
    }
}
