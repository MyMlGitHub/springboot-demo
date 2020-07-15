package com.ml.service.quartz;

import com.ml.mapper.LawCasePendingRecordMapper;
import com.ml.po.LawCasePendingRecord;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class timingReadCaseData extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(timingReadCaseData.class);
    private static SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //保存数据库中读取到的数据
    private static ConcurrentHashMap<Integer, String> caseSerialNoMap = new ConcurrentHashMap<>();

    @Resource
    private LawCasePendingRecordMapper lawCasePendingRecordMapper;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        //TODO 这里写定时任务的执行逻辑
        List<LawCasePendingRecord> caseDataAll = lawCasePendingRecordMapper.findAll("0");

        for (LawCasePendingRecord caseData : caseDataAll) {
            asyncDisposeCase(caseData);
        }
    }


    @Async("asyncExecutor")
    public void asyncDisposeCase(LawCasePendingRecord caseData) {
        logger.info("[{}] start executeAsync", caseData.getSerialNo());
        long start = System.currentTimeMillis();
        long end = 0;
        try{
//            caseSerialNoMap.put(i, ymdhms.format(new Date()));
            end = System.currentTimeMillis();
        }catch(Exception e){
            e.printStackTrace();
        }
        logger.info("[{}] end executeAsync 耗时 [{}]秒", "", (end-start)/1000);
    }
}