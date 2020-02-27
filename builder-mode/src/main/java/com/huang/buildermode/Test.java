package com.huang.buildermode;

/**
 * @author hsz
 * @data 2020/2/27 13:50:30
 */
public class Test {
    public static void main(String[] args) {
        Contract contract = new Contract.Builder()
                .setParam1(1)
                .setParam3(3)
                .build();
        System.out.println(contract);
    }
}
