package com.huang.strategymode.strategy;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        CalculatorContext context1 = new CalculatorContext("+");
        context1.compute(6, 3);

        CalculatorContext context2 = new CalculatorContext("-");
        context2.compute(6, 3);

        CalculatorContext context3 = new CalculatorContext("*");
        context3.compute(6, 3);

        CalculatorContext context4 = new CalculatorContext("/");
        context4.compute(6, 3);
    }
}
