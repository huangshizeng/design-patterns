package com.huang.strategymode.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hsz
 */

public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();
    private static Map<String, CalculatorStrategy> map = new HashMap<String, CalculatorStrategy>();

    static {
        map.put("+", new Addition());
        map.put("-", new Subtraction());
        map.put("*", new Multiplication());
        map.put("/", new Division());
    }

    public static StrategyFactory getInstance() {
        return factory;
    }

    public CalculatorStrategy getStrategy(String type) {
        return map.get(type);
    }
}
