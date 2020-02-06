package com.huang.proxymode.staticproxy;

import com.huang.proxymode.CarFactory;
import com.huang.proxymode.SellCar;

/**
 * @author hsz
 */

public class CarShop implements SellCar {

    private CarFactory carFactory;

    public CarShop() {
        carFactory = new CarFactory();
    }

    public void sellCar() {
        carFactory.sellCar();
    }
}
