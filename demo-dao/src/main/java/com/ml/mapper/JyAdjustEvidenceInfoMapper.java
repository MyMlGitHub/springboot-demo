package com.ml.mapper;

import com.ml.po.JyAdjustEvidenceInfo;

public interface JyAdjustEvidenceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyAdjustEvidenceInfo record);

    int insertSelective(JyAdjustEvidenceInfo record);

    JyAdjustEvidenceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyAdjustEvidenceInfo record);

    int updateByPrimaryKey(JyAdjustEvidenceInfo record);
}