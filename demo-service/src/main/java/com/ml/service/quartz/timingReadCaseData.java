package com.ml.service.quartz;

import com.ml.mapper.JyAdjustInfoMapper;
import com.ml.mapper.JyLawInfoMapper;
import com.ml.mapper.LawCasePendingRecordMapper;
import com.ml.po.JyAdjustInfo;
import com.ml.po.JyLawInfo;
import com.ml.po.LawCasePendingRecord;
import com.ml.vo.JyCaseInfoVO;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;


public class timingReadCaseData extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(timingReadCaseData.class);
//    private static SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private LawCasePendingRecordMapper lawCasePendingRecordMapper;
    @Resource
    private JyLawInfoMapper jyLawInfoMapper;
    @Resource
    private JyAdjustInfoMapper jyAdjustInfoMapper;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        //TODO 这里写定时任务的执行逻辑
        List<LawCasePendingRecord> caseDataAll = lawCasePendingRecordMapper.findAll();
        //循环遍历需要汇聚的案件
        for (LawCasePendingRecord caseData : caseDataAll) {
            asyncDisposeCase(caseData);
        }
    }


    @Async("asyncExecutor")
    public void asyncDisposeCase(LawCasePendingRecord caseData) {
        logger.info("[{}] start executeAsync", caseData.getSerialNo());
        long start = System.currentTimeMillis();
        JyCaseInfoVO caseInfo = new JyCaseInfoVO();

        JyLawInfo lawInfo = new JyLawInfo();
        lawInfo.setSerialNo(caseData.getSerialNo());
        lawInfo = jyLawInfoMapper.selectByJyLawInfo(lawInfo);

        if(Objects.isNull(lawInfo.getId())){
            JyAdjustInfo adjustInfo = new JyAdjustInfo();
            adjustInfo.setSerialNo(caseData.getSerialNo());
            adjustInfo = jyAdjustInfoMapper.selectByJyAdjustInfo(adjustInfo);
            if(Objects.isNull(adjustInfo.getId())){
                return;
            }else{
                BeanUtils.copyProperties(caseInfo, adjustInfo);
            }
        }else{
            BeanUtils.copyProperties(caseInfo, lawInfo);
        }

//        if(Objects.isNull(caseInfo)) return;


        long end = System.currentTimeMillis();
        logger.info("[{}] end executeAsync 耗时 [{}]秒", "", (end-start)/1000);
    }
}