package com.huang.proxypattern.dynamicproxy;

import com.huang.proxypattern.SellCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hsz
 */

public class CarInvocationHandler implements InvocationHandler {

    private SellCar sellCar;

    public CarInvocationHandler(SellCar sellCar) {
        this.sellCar = sellCar;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(sellCar, args);
    }
}
