package com.huang.statepattern.state;

import com.huang.statepattern.LeaveRequestModel;
import com.huang.statepattern.StateMachine;

import java.util.Scanner;

/**
 * 组长审批状态
 *
 * @author hsz
 */

public class GroupLeaderState implements LeaveRequestState {

    public void process(StateMachine stateMachine) {
        //先提取业务对象
        LeaveRequestModel businessObj = (LeaveRequestModel) stateMachine.getBusinessVO();
        System.out.println("组长审核中。。。");
        //模拟用户界面,从控制台读取数据
        System.out.println(businessObj.getUser() + "申请从" + businessObj.getBaginDate() + "开始请假" + businessObj.getLeaveDays() + "天，请组长审核(1同意，2不同意)：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String res = "不同意";
            if (a == 1) {
                res = "同意";
            }
            businessObj.setResult("组长审核结果：" + res);
            //根据选择的结果和条件选择下一步
            if (a == 1) {
                if (businessObj.getLeaveDays() > 3) {
                    //3天以上的假组长同意了则交由部门经理审核
                    stateMachine.setState(new DepManagerState());
                    stateMachine.process();
                } else {
                    //3天以内的假组长直接做主，就不用交给部门经理了，转向审核结束状态
                    stateMachine.setState(new AuditOverState());
                    stateMachine.process();
                }
            } else {
                //如果组长不同意，就不用交给部门经理了，转向审核结束状态
                stateMachine.setState(new AuditOverState());
                stateMachine.process();
            }
        }
    }
}
