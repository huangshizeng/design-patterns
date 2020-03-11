package com.huang.chainmode.validator;


/**
 * @author hsz
 * @data 2020/2/28 14:23:11
 */

public class ConnectivityValidator implements Validator {

    public void validator(Object o, ValidatorChain chain) {
        // 对o做一些校验
        //
        chain.validator(o);
    }
}
