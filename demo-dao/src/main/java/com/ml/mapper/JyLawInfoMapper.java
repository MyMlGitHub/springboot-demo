package com.ml.mapper;

import com.ml.po.JyLawInfo;

public interface JyLawInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyLawInfo record);

    int insertSelective(JyLawInfo record);

    JyLawInfo selectByPrimaryKey(Integer id);

    JyLawInfo selectByJyLawInfo(JyLawInfo record);

    int updateByPrimaryKeySelective(JyLawInfo record);

    int updateByPrimaryKey(JyLawInfo record);
}