package com.huang.statepattern;

import lombok.Data;

import java.util.Date;

/**
 * 请假单业务模型
 *
 * @author hsz
 */

@Data
public class LeaveRequestModel {

    /**
     * 请假人
     */
    private String user;
    /**
     * 请假开始日期
     */
    private Date baginDate;
    /**
     * 请假天数
     */
    private Integer leaveDays;
    /**
     * 审核结果
     */
    private String result;
}
