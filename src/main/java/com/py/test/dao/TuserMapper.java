package com.py.test.dao;

import com.py.test.entity.mysql.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tuser record);

    Tuser selectByPrimaryKey(Long id);
    Tuser selectByUserName(String username);

    int updateByPrimaryKeySelective(Tuser record);

}