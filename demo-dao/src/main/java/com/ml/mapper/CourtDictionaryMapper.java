package com.ml.mapper;

import com.ml.po.CourtDictionary;

public interface CourtDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourtDictionary record);

    int insertSelective(CourtDictionary record);

    CourtDictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourtDictionary record);

    int updateByPrimaryKey(CourtDictionary record);
}