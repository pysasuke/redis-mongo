package com.py.test.doubleMysql;

import com.py.test.core.DataSourceContextHolder;
import com.py.test.core.DataSourceType;
import com.py.test.dao.ImuserMapper;
import com.py.test.dao.TuserMapper;
import com.py.test.entity.Imuser;
import com.py.test.entity.Tuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class TestDoubleMysql {
    @Autowired
    private ImuserMapper imuserMapper;

    @Autowired
    private TuserMapper tuserMapper;
    @Test
    public void test() {


        Imuser imuser1 = new Imuser();
        imuser1.setPhone("18650140605");

        DataSourceContextHolder.setDBType(DataSourceType.DB_TEAMTALK);
        int row = imuserMapper.insertSelective(imuser1);
        DataSourceContextHolder.clearDBType();

        DataSourceContextHolder.setDBType(DataSourceType.DB_ERP);
        Tuser tuser = tuserMapper.selectByPrimaryKey(1l);
        DataSourceContextHolder.clearDBType();
    }
}
