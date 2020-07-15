package com.ml.service.impl;

import com.ml.mapper.LawCasePendingRecordMapper;
import com.ml.po.LawCasePendingRecord;
import com.ml.service.CaseDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CaseDataServiceImpl implements CaseDataService {

    @Resource
    private LawCasePendingRecordMapper lawCasePendingRecordMapper;

    /** 根据状态查询全部数据 */
    public List<LawCasePendingRecord> findAll(String state){
        return lawCasePendingRecordMapper.findAll(state);
    }
}
