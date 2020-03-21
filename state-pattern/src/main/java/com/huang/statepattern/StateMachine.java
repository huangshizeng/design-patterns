package com.huang.statepattern;

import com.huang.statepattern.state.State;
import lombok.Data;

/**
 * 状态机，相当于Context
 *
 * @author hsz
 */

@Data
public class StateMachine {

    /**
     * 持有的状态对象
     */
    private State state;

    /**
     * 处理状态过程中需要的业务数据
     */
    private Object businessVO;

    public void process() {
        state.process(this);
    }
}
