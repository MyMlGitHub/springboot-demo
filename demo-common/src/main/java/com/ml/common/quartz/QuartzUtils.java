package com.ml.common.quartz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.*;

import java.util.Map;
import java.util.Objects;

public class QuartzUtils {

    private static final Logger logger = LogManager.getLogger(QuartzUtils.class);

    /**
     * 创建定时任务 定时任务创建之后默认启动状态
     * @param scheduler   调度器
     * @param quartzJobBean  定时任务信息类 jobTimes
     */
    public static void createScheduleJob(Scheduler scheduler, QuartzJobBean quartzJobBean, Map<String, Object> argMap){
        try {
            //获取到定时任务的执行类  必须是类的绝对路径名称
            //定时任务类需要是job类的具体实现 QuartzJobBean是job的抽象类。
            Class<?> jobClass =  Class.forName(quartzJobBean.getJobClass());
            // 构建定时任务信息
            JobDetail jobDetail = JobBuilder.newJob(jobClass.asSubclass(Job.class))//指定干活的类
                    .withIdentity(quartzJobBean.getJobName())//定义任务名称和所属的组
                    .build();
            // 设置定时任务执行方式
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(quartzJobBean.getCron());
            // 构建触发器trigger
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(quartzJobBean.getJobName())//定义触发器名称和所属的组
                    .withSchedule(scheduleBuilder.withMisfireHandlingInstructionDoNothing()).build();
            if(Objects.nonNull(argMap)){
                //获得JobDataMap，写入数据
                trigger.getJobDataMap().putAll(argMap);
            }
            scheduler.scheduleJob(jobDetail, trigger);
            // 启动
            if (!scheduler.isShutdown()) {
                scheduler.start();
            }
        } catch (ClassNotFoundException e) {
            logger.error("定时任务类路径出错：请输入类的绝对路径");
        } catch (SchedulerException e) {
            logger.error("创建定时任务出错：");
            e.printStackTrace();
        }
    }

    /**
     * 更新定时任务
     * @param scheduler   调度器
     * @param quartzJobBean  定时任务信息类
     */
    public static void updateScheduleJob(Scheduler scheduler, QuartzJobBean quartzJobBean, Map<String, Object> argMap)  {
        try {
            //获取到对应任务的触发器
            TriggerKey triggerKey = TriggerKey.triggerKey(quartzJobBean.getJobName());
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            if (trigger == null) {
                return;
            }
            //设置定时任务执行方式
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(quartzJobBean.getCron());
            //重新构建任务的触发器trigger
            trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
            if(Objects.nonNull(argMap)){
                //修改map
                trigger.getJobDataMap().putAll(argMap);
            }
            //重置对应的job
            scheduler.rescheduleJob(triggerKey, trigger);
        } catch (SchedulerException e) {
            logger.error("更新定时任务出错：");
            e.printStackTrace();
        }
    }

    /**
     * 根据任务名称暂停定时任务
     * @param scheduler  调度器
     * @param jobName    定时任务名称
     */
    public static void pauseScheduleJob(Scheduler scheduler, String jobName){
        try {
            JobKey jobKey = JobKey.jobKey(jobName);
            scheduler.pauseJob(jobKey);
        } catch (SchedulerException e) {
            logger.error("暂停定时任务出错：");
            e.printStackTrace();
        }
    }

    /**
     * 根据任务名称恢复定时任务
     * @param scheduler  调度器
     * @param jobName    定时任务名称
     */
    public static void resumeScheduleJob(Scheduler scheduler, String jobName) {
        try {
            JobKey jobKey = JobKey.jobKey(jobName);
            scheduler.resumeJob(jobKey);
        } catch (SchedulerException e) {
            logger.error("恢复定时任务出错：");
            e.printStackTrace();
        }
    }

    /**
     * 根据定时任务名称从调度器当中删除定时任务
     * @param scheduler 调度器
     * @param jobName   定时任务名称
     */
    public static void deleteScheduleJob(Scheduler scheduler, String jobName) {
        try {
            TriggerKey triggerKey = TriggerKey.triggerKey(jobName);
            scheduler.pauseTrigger(triggerKey);//停止触发器
            scheduler.unscheduleJob(triggerKey);// 移除触发器
            // 删除任务
            JobKey jobKey = JobKey.jobKey(jobName);
            scheduler.deleteJob(jobKey);
        } catch (SchedulerException e) {
            logger.error("删除定时任务出错：");
            e.printStackTrace();
        }
    }

    /**
     * 根据任务名称立即运行一次定时任务
     * @param scheduler     调度器
     * @param jobName       定时任务名称
     */
    public static void runOnce(Scheduler scheduler, String jobName){
        JobKey jobKey = JobKey.jobKey(jobName);
        try {
            scheduler.triggerJob(jobKey);
        } catch (SchedulerException e) {
            logger.error("运行定时任务出错：");
            e.printStackTrace();
        }
    }
}