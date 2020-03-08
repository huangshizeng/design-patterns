package com.huang.strategymode.strategy;

/**
 * 加法策略
 *
 * @author hsz
 */

public class Multiplication implements CalculatorStrategy {

    public void compute(int a, int b) {
        System.out.println("乘法运算：" + a + "*" + b + "=" + (a * b));
    }
}
