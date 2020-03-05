package validator;


import java.util.ArrayList;
import java.util.List;

/**
 * 校验器调用链
 *
 * @author hsz
 * @data 2020/2/28 14:26:16
 */

public class ValidatorChain {

    private List<Validator> validators = new ArrayList<Validator>();
    private int index = 0;

    public void validator(Object o) {
        if (this.index < validators.size()) {
            Validator validator = validators.get(this.index++);
            validator.validator(o, this);
        }
    }

    public void addValidator(Validator validator) {
        validators.add(validator);
    }
}
