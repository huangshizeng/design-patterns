package com.huang.templatemethodpattern;

/**
 * 食谱，提供一个炒菜的模板
 *
 * @author hsz
 * @data 2020/3/11 14:39:04
 */
public abstract class Recipe {

    public void step1() {
        System.out.println("第一步：倒入油，放入蒜，姜炒几下");
    }

    public abstract void step2();

    public void step3() {
        System.out.println("最后一步：翻炒几下即可出锅");
    }

    public void cook() {
        step1();
        step2();
        step3();
    }
}
