package com.huang.proxypattern.staticproxy;

import com.huang.proxypattern.CarFactory;
import com.huang.proxypattern.SellCar;

/**
 * @author hsz
 */

public class CarShop implements SellCar {

    private CarFactory carFactory;

    public CarShop() {
        carFactory = new CarFactory();
    }

    public void sellCar() {
        System.out.println("汽车4S店售出一辆汽车");
        carFactory.sellCar();
    }
}
