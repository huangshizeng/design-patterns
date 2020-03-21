package com.huang.statepattern.state;

import com.huang.statepattern.LeaveRequestModel;
import com.huang.statepattern.StateMachine;

import java.util.Scanner;

/**
 * 部门经理审批状态
 *
 * @author hsz
 */

public class DepManagerState implements LeaveRequestState {

    public void process(StateMachine stateMachine) {
        //先提取业务对象
        LeaveRequestModel businessObj = (LeaveRequestModel) stateMachine.getBusinessVO();
        System.out.println("部门经理审核中。。。");
        //模拟用户界面,从控制台读取数据
        System.out.println(businessObj.getUser() + "申请从" + businessObj.getBaginDate() + "开始请假" + businessObj.getLeaveDays() + "天，请部门审核(1同意，2不同意)：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String res = "不同意";
            if (a == 1) {
                res = "同意";
            }
            businessObj.setResult("部门经理审核结果：" + res);
            //部门经理审核后，转向审核结束状态
            stateMachine.setState(new AuditOverState());
            stateMachine.process();
        }
    }
}
