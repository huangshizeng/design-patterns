package com.huang.statepattern;

import com.huang.statepattern.state.GroupLeaderState;

import java.util.Date;

/**
 * @author hsz
 */

public class Test {

    public static void main(String[] args) {
        LeaveRequestModel model = new LeaveRequestModel();
        model.setBaginDate(new Date());
        model.setUser("黄世增");
        model.setLeaveDays(4);
        StateMachine stateMachine = new LeaveRequestContext();
        stateMachine.setBusinessVO(model);
        // 先提交给组长审核
        stateMachine.setState(new GroupLeaderState());
        stateMachine.process();
    }
}
