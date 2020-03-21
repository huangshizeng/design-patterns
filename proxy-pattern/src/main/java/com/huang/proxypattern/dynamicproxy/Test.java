package com.huang.proxypattern.dynamicproxy;

import com.huang.proxypattern.SellCar;


/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        SellCar sellCar = DynamicProxyFactory.getInstance();
        sellCar.sellCar();
    }
}
