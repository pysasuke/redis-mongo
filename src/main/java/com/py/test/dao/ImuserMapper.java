package com.py.test.dao;

import com.py.test.entity.mysql.IMUser;

public interface ImuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IMUser record);

    IMUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IMUser record);

}