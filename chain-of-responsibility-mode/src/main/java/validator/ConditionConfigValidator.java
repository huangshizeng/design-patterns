package validator;


/**
 * @author hsz
 * @data 2020/3/1 17:00:29
 */

public class ConditionConfigValidator implements Validator {

    public void validator(Object o, ValidatorChain chain) {
        // 对o做一些校验
        //
        chain.validator(o);
    }
}
