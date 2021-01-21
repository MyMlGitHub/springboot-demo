package com.ml.mapper;

import com.ml.po.JyAgentInfo;

public interface JyAgentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyAgentInfo record);

    int insertSelective(JyAgentInfo record);

    JyAgentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyAgentInfo record);

    int updateByPrimaryKey(JyAgentInfo record);
}