package com.py.test.dao;

import com.py.test.entity.Imuser;

public interface ImuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Imuser record);

    int insertSelective(Imuser record);

    Imuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Imuser record);

    int updateByPrimaryKey(Imuser record);
}