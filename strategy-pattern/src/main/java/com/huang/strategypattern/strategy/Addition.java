package com.huang.strategypattern.strategy;

/**
 * 加法策略
 *
 * @author hsz
 */

public class Addition implements CalculatorStrategy {

    public void compute(int a, int b) {
        System.out.println("加法运算：" + a + "+" + b + "=" + (a + b));
    }
}
