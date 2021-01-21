package com.ml.mapper;

import com.ml.po.JyLawAgentInfo;

public interface JyLawAgentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyLawAgentInfo record);

    int insertSelective(JyLawAgentInfo record);

    JyLawAgentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyLawAgentInfo record);

    int updateByPrimaryKey(JyLawAgentInfo record);
}