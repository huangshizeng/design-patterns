package com.huang.strategymode.strategy;


/**
 * @author hsz
 */

public class CalculatorContext {

    private CalculatorStrategy strategy;

    public CalculatorContext(String type) {
        this.strategy = StrategyFactory.getInstance().getStrategy(type);
    }

    public void computer(int a, int b) {
        strategy.compute(a, b);
    }
}
