package com.ml.mapper;

import com.ml.po.JyLawApplyerInfo;

public interface JyLawApplyerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyLawApplyerInfo record);

    int insertSelective(JyLawApplyerInfo record);

    JyLawApplyerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyLawApplyerInfo record);

    int updateByPrimaryKey(JyLawApplyerInfo record);
}