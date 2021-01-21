package com.ml.mapper;

import com.ml.po.JyDocumentInfo;

public interface JyDocumentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JyDocumentInfo record);

    int insertSelective(JyDocumentInfo record);

    JyDocumentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JyDocumentInfo record);

    int updateByPrimaryKeyWithBLOBs(JyDocumentInfo record);

    int updateByPrimaryKey(JyDocumentInfo record);
}