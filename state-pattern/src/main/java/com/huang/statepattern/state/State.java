package com.huang.statepattern.state;

import com.huang.statepattern.StateMachine;

/**
 * 通用状态接口
 *
 * @author hsz
 */
public interface State {

    void process(StateMachine stateMachine);
}
