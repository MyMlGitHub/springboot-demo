package com.ml.common.quartz;

import lombok.Data;

@Data
public class QuartzJobBean {
    /** 任务名称 */
    private String jobName;

    /** 任务执行类 */
    private String jobClass;

    /** 任务状态 启动还是暂停*/
    private Integer status;

    /** 任务运行时间表达式 */
    private String cron;
}