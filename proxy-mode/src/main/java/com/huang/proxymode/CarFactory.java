package com.huang.proxymode;

/**
 * @author hsz
 */

public class CarFactory implements SellCar {

    public void sellCar() {
        System.out.println("汽车工厂售出一辆车");
    }
}
