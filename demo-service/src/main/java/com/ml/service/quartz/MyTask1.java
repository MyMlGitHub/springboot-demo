package com.ml.service.quartz;

import com.ml.po.SysUser;
import com.ml.service.SysUserService;
import com.ml.vo.SysUserVO;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.util.Date;

public class MyTask1 extends QuartzJobBean {

    //验证是否成功可以注入service   之前在ssm当中需要额外进行配置
    @Resource
    private SysUserService service;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SysUserVO userVO = new SysUserVO();
        userVO.setLoginAccount("test");
        SysUser user = service.findMasterSysUserByName(userVO);
        System.out.println(user.toString());
        //TODO 这里写定时任务的执行逻辑
        System.out.println("动态的定时任务执行时间："+new Date().toLocaleString());
    }
}