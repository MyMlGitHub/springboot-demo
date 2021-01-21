package com.ml.mapper;

import com.ml.po.JyWorkFlow;

public interface JyWorkFlowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyWorkFlow record);

    int insertSelective(JyWorkFlow record);

    JyWorkFlow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyWorkFlow record);

    int updateByPrimaryKeyWithBLOBs(JyWorkFlow record);

    int updateByPrimaryKey(JyWorkFlow record);
}