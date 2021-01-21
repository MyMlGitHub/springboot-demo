package com.ml.mapper;

import com.ml.po.LawCasePendingRecord;

import java.util.List;

public interface LawCasePendingRecordMapper {

    /** 根据状态查询全部数据 */
    List<LawCasePendingRecord> findAll();

    /** 新增数据 */
    int addLawCasePendingRecord(LawCasePendingRecord lawCasePendingRecord);
    
}
