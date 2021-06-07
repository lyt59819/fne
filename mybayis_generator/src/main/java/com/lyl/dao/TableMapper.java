package com.lyl.dao;

import com.lyl.entity.Table;

public interface TableMapper {
    int deleteByPrimaryKey(String id);

    int insert(Table record);

    int insertSelective(Table record);

    Table selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}