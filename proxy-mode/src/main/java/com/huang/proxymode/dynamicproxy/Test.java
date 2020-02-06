package com.huang.proxymode.dynamicproxy;

import com.huang.proxymode.SellCar;


/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        SellCar sellCar = DynamicProxyFactory.getInstance();
        sellCar.sellCar();
    }
}
