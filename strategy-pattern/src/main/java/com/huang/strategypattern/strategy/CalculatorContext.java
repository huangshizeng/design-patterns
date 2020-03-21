package com.huang.strategypattern.strategy;


/**
 * @author hsz
 */

public class CalculatorContext {

    private CalculatorStrategy strategy;

    public CalculatorContext(String type) {
        this.strategy = StrategyFactory.getInstance().getStrategy(type);
    }

    public void compute(int a, int b) {
        strategy.compute(a, b);
    }
}
