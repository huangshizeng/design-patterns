package com.huang.adaptermode;

/**
 * 适配类
 *
 * @author hsz
 */

public class Adapter implements Socket {

    private Computer computer;

    public Adapter(Computer computer) {
        this.computer = computer;
    }

    public void charge220() {
        System.out.println("使用适配器让插座可以给电脑充电");
        computer.charge50();
    }
}
