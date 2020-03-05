package validator;


/**
 * 适配器配置校验器
 *
 * @author hsz
 * @data 2020/2/28 16:45:36
 */

public class AdapterConfigValidator implements Validator {

    public void validator(Object o, ValidatorChain chain) {
        // 对o做一些校验
        //
        chain.validator(o);
    }
}
