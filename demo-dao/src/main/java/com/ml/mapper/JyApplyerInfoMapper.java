package com.ml.mapper;

import com.ml.po.JyApplyerInfo;

public interface JyApplyerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyApplyerInfo record);

    int insertSelective(JyApplyerInfo record);

    JyApplyerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyApplyerInfo record);

    int updateByPrimaryKey(JyApplyerInfo record);
}