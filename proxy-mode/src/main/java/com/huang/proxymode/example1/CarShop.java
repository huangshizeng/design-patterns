package com.huang.proxymode.example1;

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
