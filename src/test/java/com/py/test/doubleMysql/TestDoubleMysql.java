package com.py.test.doubleMysql;

import com.py.test.core.DataSourceContextHolder;
import com.py.test.core.DataSourceType;
import com.py.test.dao.ImuserMapper;
import com.py.test.dao.TuserMapper;
import com.py.test.entity.mysql.IMUser;
import com.py.test.entity.mysql.Tuser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * mysql双数据源测试
 * Created by Administrator on 2016/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml") //加载xml文件
public class TestDoubleMysql {
    @Autowired
    private ImuserMapper imuserMapper;

    @Autowired
    private TuserMapper tuserMapper;

    @Test
    public void test() {
        IMUser imUser = generateIMUser();
        DataSourceContextHolder.setDBType(DataSourceType.DB_IM);
        int row_im = imuserMapper.insert(imUser);
        Assert.assertEquals(1, row_im);
        DataSourceContextHolder.clearDBType();

        Tuser tuser = generateTuser();
        DataSourceContextHolder.setDBType(DataSourceType.DB_ERP);
        int row_t = tuserMapper.insert(tuser);
        Assert.assertEquals(1, row_t);
        DataSourceContextHolder.clearDBType();
    }

    private IMUser generateIMUser() {
        IMUser imUser = new IMUser();
        imUser.setUsername("lisi");
        imUser.setPassword("123456");
        imUser.setNickname("huahua");
        imUser.setEmail("123456@qq.com");
        imUser.setMobile("18650140605");
        return imUser;
    }

    private Tuser generateTuser() {
        Tuser tuser = new Tuser();
        tuser.setUsername("zhangsan");
        tuser.setPassword("123456");
        tuser.setMobile("13666666666");
        tuser.setEmail("123456@qq.com");
        return tuser;
    }
}
