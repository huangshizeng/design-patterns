package com.huang.proxymode.dynamicproxy;

import com.huang.proxymode.CarFactory;
import com.huang.proxymode.SellCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 获取代理类实例对象
 *
 * @author hsz
 */

public class DynamicProxyFactory {

    public static SellCar getInstance() {
        SellCar sellCar = new CarFactory();
        InvocationHandler h = new CarInvocationHandler(sellCar);
        return (SellCar) Proxy.newProxyInstance(sellCar.getClass().getClassLoader(),
                sellCar.getClass().getInterfaces(), h);
    }
}
