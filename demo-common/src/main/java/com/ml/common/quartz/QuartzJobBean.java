package com.ml.common.quartz;

import lombok.Data;

@Data
public class QuartzJobBean {

    /** 任务执行类 */
    private String jobClass;

    /** 任务名称 */
    private String jobName;

    /** 任务组名称 */
    private String jobGroupName;

    /** 触发器名称 */
    private String triggerName;

    /** 触发器组名称 */
    private String triggerGroupName;

    /** 任务运行时间表达式 */
    private String cron;

}