package com.ml.web.controller;

import com.ml.common.quartz.QuartzJobBean;
import com.ml.common.quartz.QuartzUtils;
import org.quartz.Scheduler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/quartz")
public class QuartzController {
    //注入定时任务调度器
    @Resource
    private Scheduler scheduler;

    @RequestMapping("/createJob")
    @ResponseBody
    public String createJob(QuartzJobBean quartzJobBean) {
        try {
            //进行测试所以写死
            quartzJobBean.setJobClass("com.ml.service.quartz.timingReadCaseData");
            quartzJobBean.setJobName("test1");
            quartzJobBean.setCron("0/60 * * * * ? ");
            QuartzUtils.createScheduleJob(scheduler, quartzJobBean, null);
            System.out.println("[创建]定时任务执行时间：创建");
        } catch (Exception e) {
            return "创建失败";
        }
        return "创建成功";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(QuartzJobBean quartzJobBean) {
        try {
            //进行测试所以写死
            quartzJobBean.setJobClass("com.ml.service.quartz.timingReadCaseData");
            quartzJobBean.setJobName("test1");
            quartzJobBean.setCron("0/10 * * * * ? ");
            QuartzUtils.updateScheduleJob(scheduler, quartzJobBean, null);
            System.out.println("[更新]定时任务执行时间：更新");
        } catch (Exception e) {
            return "更新失败";
        }
        return "更新成功";
    }

    @RequestMapping("/pauseJob")
    @ResponseBody
    public String pauseJob() {
        try {
            QuartzUtils.pauseScheduleJob(scheduler, "test1");
            System.out.println("[暂停]定时任务执行时间：暂停");
        } catch (Exception e) {
            return "暂停失败";
        }
        return "暂停成功";
    }

    @RequestMapping("/resume")
    @ResponseBody
    public String resume() {
        try {
            QuartzUtils.resumeScheduleJob(scheduler, "test1");
            System.out.println("[恢复]定时任务执行时间：恢复");
        } catch (Exception e) {
            return "恢复失败";
        }
        return "恢复成功";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        try {
            QuartzUtils.deleteScheduleJob(scheduler, "test1");
            System.out.println("[删除]定时任务执行时间：删除");
        } catch (Exception e) {
            return "删除失败";
        }
        return "删除成功";
    }

    @RequestMapping("/runOnce")
    @ResponseBody
    public String runOnce() {
        try {
            QuartzUtils.runOnce(scheduler, "test1");
        } catch (Exception e) {
            return "运行一次失败";
        }
        return "运行一次成功";
    }

}