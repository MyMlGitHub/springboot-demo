package com.ml.mapper;

import com.ml.po.JyAdjustInfo;

public interface JyAdjustInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyAdjustInfo record);

    int insertSelective(JyAdjustInfo record);

    JyAdjustInfo selectByPrimaryKey(Integer id);

    JyAdjustInfo selectByJyAdjustInfo(JyAdjustInfo record);

    int updateByPrimaryKeySelective(JyAdjustInfo record);

    int updateByPrimaryKey(JyAdjustInfo record);
}