package com.ml.service;

import com.ml.po.LawCasePendingRecord;

import java.util.List;

public interface CaseDataService {

    /** 根据状态查询全部数据 */
    List<LawCasePendingRecord> findAll(String state);
}
