package com.huang.statepattern.state;

import com.huang.statepattern.LeaveRequestModel;
import com.huang.statepattern.StateMachine;

/**
 * 审核结束状态
 *
 * @author hsz
 */

public class AuditOverState implements State {

    public void process(StateMachine stateMachine) {
        LeaveRequestModel businessObj = (LeaveRequestModel) stateMachine.getBusinessVO();
        System.out.println(businessObj.getUser() + ",请假流程结束,结果是：" + businessObj.getResult());
    }
}
