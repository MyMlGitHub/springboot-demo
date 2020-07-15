package com.ml.service.impl;

import com.ml.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);
    private static SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static ConcurrentHashMap<Integer, String> caseSerialNoMap = new ConcurrentHashMap<>();

    @Override
    @Async("asyncExecutor")
    public void executeAsync(int i) {
        logger.info("[{}] start executeAsync", i);
        long begin = System.currentTimeMillis();
        long end = 0;
        try{
            Thread.sleep(1000L);
            caseSerialNoMap.put(i, ymdhms.format(new Date()));
            end = System.currentTimeMillis();
        }catch(Exception e){
            e.printStackTrace();
        }
        logger.info("[{}] end executeAsync 耗时 [{}]秒", i, (end-begin)/1000);
    }

    @Override
    public void acquire() {
        logger.info("caseSerialNoMap -> 总数[{}]", caseSerialNoMap.size());
        for (Map.Entry<Integer, String> entry : caseSerialNoMap.entrySet()) {
            logger.info("caseSerialNoMap -> key[{}] -> value[{}]", entry.getKey(), entry.getValue());
        }
    }

}
