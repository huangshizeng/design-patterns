package com.huang.chainmode.validator;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        AdapterConfigValidator acv = new AdapterConfigValidator();
        ConditionConfigValidator ccv = new ConditionConfigValidator();
        ConnectivityValidator cv = new ConnectivityValidator();
        ValidatorChain chain = new ValidatorChain();
        chain.addValidator(acv);
        chain.addValidator(ccv);
        chain.addValidator(cv);
        chain.validator(new Object());
    }
}
