package com.ml.mapper;

import com.ml.po.SysUserDepartments;

public interface SysUserDepartmentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserDepartments record);

    int insertSelective(SysUserDepartments record);

    SysUserDepartments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserDepartments record);

    int updateByPrimaryKey(SysUserDepartments record);
}